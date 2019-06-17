from django.db import models


class Klasse(models.Model):
    class_name = models.CharField(max_length=25)
    def __str__(self):
        return self.class_name


class Student(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    email = models.CharField(max_length=150)
    password = models.CharField(max_length=50)
    klasse = models.ForeignKey(Klasse, on_delete=models.CASCADE)
    def __str__(self):
        return self.first_name



class Subject(models.Model):
    name = models.CharField(max_length=25)
    def __str__(self):
        return self.name


class Grade(models.Model):
    grade = models.IntegerField() 
    student = models.ForeignKey(Student, on_delete = models.CASCADE)
    subject = models.ForeignKey(Subject, on_delete = models.CASCADE)


class Teacher(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    email = models.CharField(max_length=150)
    password = models.CharField(max_length=50)
    def __str__(self):
        return self.first_name


class Admin(models.Model):
    teacher = models.ForeignKey(Teacher, on_delete = models.CASCADE)


 
class Approved_Lesson(models.Model):
    teacher = models.ForeignKey(Teacher, on_delete= models.CASCADE)
    subject = models.ForeignKey(Subject, on_delete = models.CASCADE)


class Lesson_Subject(models.Model): 
    techer = models.ForeignKey(Teacher, on_delete = models.CASCADE)
    subject = models.ForeignKey(Subject, on_delete = models.CASCADE)
    klasse = models.ForeignKey(Klasse, on_delete = models.CASCADE)



