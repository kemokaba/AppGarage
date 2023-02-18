from django.urls import path

from . import views

app_name = 'certificat'

urlpatterns = [

    path('',views.certificats,name='certificats'),


]