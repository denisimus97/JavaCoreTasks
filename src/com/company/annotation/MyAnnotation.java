package com.company.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE) //указание что данная аннотация вешается на класс
@Retention(value = RetentionPolicy.RUNTIME) //аннотация доступна в процессе работы модуля
public @interface MyAnnotation {

    String name() default " ";

    int age();

    String profession();
}
