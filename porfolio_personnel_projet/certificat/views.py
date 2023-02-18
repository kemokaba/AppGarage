from django.shortcuts import render
from .models import Certificat


# Create your views here.
def certificats(request):
    cert = Certificat.objects.all()
    return render(request,'certificat/mescertificats.html',{'cert':cert})
