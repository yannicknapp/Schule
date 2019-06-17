from django.urls import path
from django.urls import include
from django.conf.urls import url
from django.views.generic import TemplateView

from . import views

urlpatterns = [
    path('', views.index, name='index'),
    url(r'^Lehrer/$', views.Lehrer),
    url(r'^Schüler/$', views.Schueler),
    url(r'^login/$', views.login),
    
    
]

#Add Django site authentication urls (for login, logout, password management)
#urlpatterns += [
 #   path('accounts/', include('django.contrib.auth.urls')),
#]
