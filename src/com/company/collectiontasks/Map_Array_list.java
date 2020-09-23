package com.company.collectiontasks;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
/*
* - Исследовать работу ArrayList, LinkedList, TreeSet, HashSet.
* На практике измерить время выполнения операций добавления,
* поиска и удаления элемента. Сравнить полученные результаты
* и объяснить, в каком случае какая коллекция работает быстрее.
* */
public class Map_Array_list {

    public static void main(String[] args) {

        //map
        //access order - false (default) , трогаем элемент - положение не меняется (put, get)
        System.out.println("\nAccess order is false:");
        Map <Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>() ;
        linkedhashmap.put(1, "object1");
        linkedhashmap.put(2, "object2");
        linkedhashmap.put(7, "object7");
        linkedhashmap.put(38, "obj38");
        linkedhashmap.get(38);
        //ключ=значение
        System.out.println("Keys = Values:");
        Iterator<Map.Entry<Integer, String>> itr1 = linkedhashmap.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry<Integer, String> entry = itr1.next();
            System.out.print(entry.getKey() + " = " + entry.getValue() + "; ");
        }
        //ключи
        System.out.println("Keys:");
        Iterator<Integer> itr2 = linkedhashmap.keySet().iterator();
        while(itr2.hasNext())
            System.out.print(itr2.next() + " ");
        //значения
        System.out.println("\nValues:");
        Iterator<String> itrs = linkedhashmap.values().iterator();
        while  (itrs.hasNext())
            System.out.print(itrs.next()+" ");

        System.out.println("\n\nAccess order is true:");
        //access order - false (true) , трогаем элемент - положение изменияется на начальное (put, get)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(15, 0.75f, true) {{
            put(1, "obj1");
            put(2, "obj2");
            put(7, "obj7");
            put(38, "obj38");
        }};
        linkedHashMap.get(1);
        Iterator<Integer> itr3 = linkedHashMap.keySet().iterator();
        //ключи
        System.out.println("Keys:");
        while(itr3.hasNext())
            System.out.print(itr3.next() + " ");
        //значения
        System.out.println("\nValues:");
        Iterator<String> itr4 = linkedHashMap.values().iterator();
        while (itr4.hasNext())
            System.out.print(itr4.next() + " ");
        //arraylist
        System.out.println("\nWork with array list");
        List a1 = new ArrayList();
        a1.add("C");
        a1.add("B");
        a1.add("D");
        a1.add("E");
        a1.add("G");
        a1.add("D");
        //iterator
        Iterator itr = a1.iterator();
        while (itr.hasNext())
        {
            Object element = itr.next();
            System.out.print(element + (" "));
        }
        System.out.println();
        //listiterator
        ListIterator litr = a1.listIterator();
        while (litr.hasNext())
        {
            Object element = litr.next();
            litr.set(element + " ");
        }
        System.out.print("Modified contents of al: ");
        itr = a1.iterator();

        while(itr.hasNext())
        {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();


        while (litr.hasPrevious())
        {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();

        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(12);
        list.add(12);
        list.add(49);
        System.out.println("\nList: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.print("\nList using ListItertor (Forward): ");
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext())
        {
            System.out.print(lit.next()+" ");
        }
        System.out.print("\nList using ListItertor (Backward): ");
        while (lit.hasPrevious())
        {
            System.out.print(lit.previous()+" ");
        }

    }



}
