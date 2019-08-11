from django.urls import path, re_path
from . import views

urlpatterns = [
    #path('', views.index, name='index'),
    path('topics', views.getTopics, name='topics'),
    re_path(r'^(?:topic_name=(?P<topicname>[\w]+))?(?:&topic_desc=(?P<topicdesc>[\w]+))?(?:&topic_img=(?P<topicimg>[\w]+))?$', views.createTopic),
    re_path(r'^(?:topic_id=(?P<topicid>[\d]+))?$', views.getComments),
    re_path(r'^(?:comment=(?P<commentcontent>[\w]+))?(?:&topic_id=(?P<topicid>[\d]+))?$', views.putComment)
]
