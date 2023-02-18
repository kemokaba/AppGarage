from django.db import models

class Biblio(models.Model):
    titre = models.CharField(max_length=200)
    livre = models.FileField(upload_to='books/')

    def __str__(self):
        return self.titre



