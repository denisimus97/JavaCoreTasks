package com.company.serialization;

import java.io.Serializable;

public class SerializationPeople implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient String status;

    SerializationPeople(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public int getAge() {
        return age;
    }

    public void setAge(String age) {
        this.name = name;
    }


    public void definition() {
        if (age < 3)
            status = "Sit at home";
        else if ((age > 3) & (age < 7))
            status = "Go to kindergarten";
        else if ((age > 7) & (age < 18))
            status = "Go to school";
        else if ((age > 18) & (age < 23))
            status = "Go to univercity";
        else if ((age > 23) & (age < 65))
            status = "Go to work";
        else if (age > 65)
            status = "Pension";
    }

    @Override
    public String toString() {
        return "People information:" +
                "Name=" + name +
                ", age" + age +
                ", status=" + status;

    }
}
