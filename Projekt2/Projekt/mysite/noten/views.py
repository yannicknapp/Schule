from django.http import HttpResponse
from django.contrib.auth import authenticate, login
from django.shortcuts import render
from django.contrib.auth.forms import AuthenticationForm
from .models import Student, Teacher, Grade, Subject
from django.shortcuts import get_object_or_404


def index(request):
    return HttpResponse("Hello, world. You're at the polls index.")


def Lehrer(request):
    if request.method == 'POST':
        
        schueler = Student.objects.all()
        subject = Subject.objects.all()
        email = request.POST.get('email')
        fach = request.POST.get('fach')
        gegebenenote= request.POST.get('note')
        print(fach)
        for a in schueler:
            if a.email==email:
                for f in subject:
                    if f.name==fach:
                        Grade(grade=gegebenenote,student=a,subject=f).save()

    return render(request, 'registration/Lehrer.html')

def Schueler(request, student):    

    note = Grade.objects.all()

    
    noten = Grade.objects.filter(student=student)
    return render(request, 'registration/Schüler.html', {'noten':noten})



def login(request):
    

        if request.method == 'POST':
            schueler = Student.objects.all()
            lehrer = Teacher.objects.all()

            username = request.POST.get('username')
            password = request.POST.get('password')

            user = authenticate(username=username, password=password)

            if user:
                if user.is_active:
                    for a in schueler:
                        if a.email==username:
                            return Schueler(request,a)
                    else:
                        return Lehrer(request)
                else:
                    return HttpResponse("no")
            else: 
                return HttpResponse("nono")
        else:
            return render(request, 'registration/login.html')