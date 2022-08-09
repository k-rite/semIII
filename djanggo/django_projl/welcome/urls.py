from django.urls import path
from . import views

# urlpatterns = [path('',views.greet),]
urlpatterns = [path('', views.index,name='index')]
#urlpatterns = [path('', views.testing,name='index')]