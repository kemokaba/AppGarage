from django.shortcuts import render
from django.http import HttpResponse

def compterMots(request):
    with open('books/70049-0.txt', 'r') as file:
        texte = file.read()
    mots = texte.split()
    cpt = 0 
    for word in mots:
        if len(word)<=2:
            cpt+=1
    #print("le nombre de mots dont le caractere est <= 2 est: ", cpt)
    nombre_de_mots = len(mots)
    mot = request.GET.get('mot', 'is')
    nb_fois_apparu = texte.count(mot)
    #print(nb_fois_apparu)
    return HttpResponse("Ce Livre contient {} mots ".format(nombre_de_mots) + 
                        f"Et le mot '{mot}' est présent  {nb_fois_apparu} fois dans ce livre "  +
                        f"Le nombre de mots dont le caractere est <= 2 est: {cpt}" )
    


