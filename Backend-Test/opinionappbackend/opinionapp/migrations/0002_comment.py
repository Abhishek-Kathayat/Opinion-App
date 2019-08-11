# Generated by Django 2.2.1 on 2019-08-11 08:24

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('opinionapp', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='Comment',
            fields=[
                ('comment_id', models.AutoField(primary_key=True, serialize=False)),
                ('comment_content', models.CharField(max_length=1000)),
                ('topic_id', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='opinionapp.Topic')),
            ],
        ),
    ]