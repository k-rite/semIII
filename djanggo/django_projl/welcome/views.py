#from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from . models import Members
def greet(request):
    html = "<html><body><h1>Welcome to my 1st project</h1></body></html>"
    return HttpResponse(html)
# Create your views here.
# def index(request):
#     template = loader.get_template('myfirst.html')
#     return HttpResponse(template.render())
def index(request):
    mymembers = Members.objects.all().values()
    output = ""
    for x in mymembers:
        output += x['firstname'] 
    return HttpResponse(output)

def testing(request):
    template=loader.get_template('template.html')
    context = {'firstname':'Tom'}
    return HttpResponse(template.render(context,request))