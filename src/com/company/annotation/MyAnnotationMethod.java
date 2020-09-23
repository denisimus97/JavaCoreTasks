package com.company.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD) //указание что данная аннотация вешается на класс
@Retention(value = RetentionPolicy.RUNTIME) //аннотация доступна в процессе работы модуля
public @interface MyAnnotationMethod {

    String name() default "";

    String gender();
}
