package com.company.annotation;

import java.lang.reflect.Method;


public class ReflectionTasksEx {

    public static void main(String[] args) throws NoSuchMethodException {
        ReflectionTasks first = new ReflectionTasks();
        MyAnnotation search = first.getClass().getAnnotation(MyAnnotation.class);
        System.out.println("Print from Annotation (for class) = " + search.name());
        System.out.println("Print types of Annotation with values = " + search.toString());

        ReflectionTasks second = new ReflectionTasks();
        //метод из объекта
        Method x = second.getClass().getMethod("doSomething");
        //аннотация из метода
        MyAnnotationMethod searchMethod = x.getAnnotation(MyAnnotationMethod.class);
        System.out.println("Print from Annotation (for method)= " + searchMethod.name());
        System.out.println("Print types of Annotation with values = " + searchMethod.toString());
    }

}
