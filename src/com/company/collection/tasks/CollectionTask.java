package com.company.collection.tasks;

import java.util.*;

public class CollectionTask {

    public static void main(String[] args) {
        List<Integer> arlist = new ArrayList<>();
        List<Integer> llist = new LinkedList<>();
        Set<Integer> tset = new TreeSet<>();
        HashSet<Integer> hset = new HashSet<>();

        addElem(arlist);
        addElem(llist);
        addCenterElem(arlist);
        addCenterElem(llist);
        addElem(tset);
        addElem(hset);
        removeElem(arlist);
        removeElem(llist);
        removeIterElem(arlist);
        removeIterElem(llist);
        removeElem(tset);
        removeElem(hset);
        //  System.out.println("\nArraylist: ");
        //   for (Integer i : arlist)
        //  System.out.print(i + ", ");

    }

    private static void addElem(Collection<Integer> collect) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 200000; i += 1)
            collect.add(i);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Прошло времени, мс: " + collect.getClass().getSimpleName() + " " + elapsed);
    }

    private static void addCenterElem(List<Integer> collect)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 40; i ++)
            collect.add(i);
        //доходим до середины
        ListIterator<Integer> it1 = collect.listIterator(20);
        for (int i = 0; i<10000;i++)
        {
            it1.add(i);
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Прошло времени по добавлению в середину через listiterator, мс: " + collect.getClass().getSimpleName() + " " + elapsed);
        long start1 = System.currentTimeMillis();
        for (int i = 4000; i <= 6000; i ++)
        {
            collect.contains(i);
        }
        long elapsed1 = System.currentTimeMillis() - start1;
        System.out.println("Прошло времени по поиску в середине , мс: " + collect.getClass().getSimpleName() + " " + elapsed1);

    }

    private static void removeElem(Collection<Integer> collect)
    {
        long start = System.currentTimeMillis();
        for (int i = collect.size()/2; i <=  (collect.size()/2) + 1000; i += 1)
            collect.remove(i);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Прошло времени по удалению  из  середины без listiterator , мс: " + collect.getClass().getSimpleName() + " " + elapsed);

    }

    private static void removeIterElem(List<Integer> collect)
    {
        long start = System.currentTimeMillis();
        ListIterator<Integer> it1 = collect.listIterator(4000);
        for (int i = 0; i<1000;i++)
        {
            it1.next();
            it1.remove();
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Прошло времени по удалению  из  середины c listiterator , мс: " + collect.getClass().getSimpleName() + " " + elapsed);

    }



}
