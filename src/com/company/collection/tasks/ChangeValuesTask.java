package com.company.collection.tasks;

import java.util.*;

/*
 * - Поменять местами ключи и значения в HashMap.
 * */
public class ChangeValuesTask {

    public static void main(String[] args) {
        Map<Integer, Double> map1 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map1.put(i, ((i * 1.2) + 42));
        }
        Map<Double, Integer> map2 = new HashMap<>();
        System.out.println("First map:");
        for (Map.Entry<Integer, Double> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            map2.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Second map:");
        for (Map.Entry<Double, Integer> entry : map2.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());


    }

}
