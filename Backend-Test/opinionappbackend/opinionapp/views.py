from django.shortcuts import render
from .models import Topic, Comment
from django.http import JsonResponse
from django.http import HttpResponse

# Create your views here.
def getTopics(request):
    topics = Topic.objects.all()
    topicsresponse = [
        {
            'topics_id': int(topic.topic_id),
            'topics_name': str(topic.topic_name),
            'topic_desc': str(topic.topic_desc),
            'topic_image': str(topic.topic_img)
        }
        for topic in list(topics)
    ]
    return JsonResponse(topicsresponse, safe=False)

def createTopic(request, topicname, topicdesc, topicimg):
    topics = Topic.objects.all()
    topicscount = len(list(topics))
    newtopic = Topic(topic_name = topicname, topic_desc = topicdesc, topic_img = topicimg)
    newtopic.save()
    newtopics = Topic.objects.all()
    newtopicscount = len(list(newtopics))
    if newtopicscount > topicscount:
        return HttpResponse("Topic Inserted Successfully!")
    else:
        return HttpResponse("Topic was not Inserted Successfully!")

def getComments(request, topicid):
    comments = Comment.objects.all()
    topiccomments = list()
    for comment in list(comments):
        topic = comment.topic_id
        if topic.topic_id == int(topicid):
            topiccomments.append(comment)

    commentresponse = [
         {
            'comment_id': int(comment.comment_id),
            'comment_content': str(comment.comment_content)
         }
         for comment in topiccomments
    ]

    return JsonResponse(commentresponse, safe=False)

def putComment(request, topicid, commentcontent):
    temp = commentcontent.split("_");
    newcontent = ""
    for tempcont in temp:
        newcontent = newcontent + " " + tempcont
    commentcontent = newcontent
    topics = Topic.objects.all()
    for topic in list(topics):
        if topic.topic_id == int(topicid):
            topiccomment = topic
    newcomment = Comment(topic_id = topiccomment, comment_content = commentcontent)
    newcomment.save()
    return HttpResponse("Thank you for your comment.")
