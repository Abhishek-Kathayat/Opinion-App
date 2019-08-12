from django.db import models

# Create your models here.
class Topic(models.Model):
    topic_id = models.AutoField(primary_key=True)
    topic_name = models.CharField(max_length=100)
    topic_desc = models.CharField(max_length=1000)
    topic_img = models.CharField(max_length=100)
    topic_genre = models.CharField(max_length=30, null=True)
    topic_emot = models.CharField(max_length=30, null=True)

class Comment(models.Model):
    comment_id = models.AutoField(primary_key=True)
    topic_id = models.ForeignKey(Topic, on_delete=models.CASCADE)
    comment_content = models.CharField(max_length=1000)
