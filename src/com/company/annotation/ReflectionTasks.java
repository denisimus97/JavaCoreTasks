package com.company.annotation;


@MyAnnotation(name = "Oleg", age = 24, profession = "teacher")
public class ReflectionTasks {
    @MyAnnotationMethod(name = "Oleg", gender = "MAN")
    public void doSomething() {
        System.out.println("Do something actions!");
    }

}

