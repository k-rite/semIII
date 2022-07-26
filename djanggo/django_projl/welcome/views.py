#from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
def greet(request):
    html = "<html><body><h1>Welcome to my 1st project</h1></body></html>"
    return HttpResponse(html)
# Create your views here.
def index(request):
    template = loader.get_template('myfirst.html')
    return HttpResponse(template.render())

def testing(request):
    template=loader.get_template('template.html')
    context = {'firstname':'Tom'}
    return HttpResponse(template.render(context,request))