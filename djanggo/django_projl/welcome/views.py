#from django.shortcuts import render
from django.http import HttpResponse
def greet(request):
    html = "<html><body><h1>Welcome to my 1st project</h1></body></html>"
    return HttpResponse(html)
# Create your views here.
