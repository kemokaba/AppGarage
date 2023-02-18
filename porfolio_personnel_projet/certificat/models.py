from django.db import models


class Certificat(models.Model):
    title = models.CharField(max_length=100)
    fichier = models.FileField()

    def __str__(self):
        return self.title