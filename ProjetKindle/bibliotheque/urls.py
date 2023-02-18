from django.urls import path
from .views import compterMots

path('compter-mots/', compterMots, name='compterMots')