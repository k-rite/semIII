from django.db import models

# Create your models here.
class appname(models.Model):
    firstname = models.CharField(max_length=33)
    lastname = models.CharField(max_length=33)