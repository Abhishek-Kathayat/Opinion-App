# Generated by Django 2.2.1 on 2019-08-11 06:54

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Topic',
            fields=[
                ('topic_id', models.AutoField(primary_key=True, serialize=False)),
                ('topic_name', models.CharField(max_length=100)),
                ('topic_desc', models.CharField(max_length=1000)),
                ('topic_img', models.CharField(max_length=100)),
            ],
        ),
    ]
