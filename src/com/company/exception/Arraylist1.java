package com.company.exception;


import java.util.ArrayList;
import java.util.List;

class Arraylist1<E> {

    private List<E> arraylist = new ArrayList<>();

    public void add(E e) throws Myexeption {
        if (arraylist.size() > 10)
            throw new Myexeption();
        else arraylist.add(e);
    }

    public void add(int index, E e) throws Myexeption {
        if (arraylist.size() > 10)
            throw new Myexeption();
        else arraylist.add(index, e);
    }


    public Arraylist1(List<E> arraylist) throws Myexeption {
        if (arraylist.size() > 10)
            throw new Myexeption();

        this.arraylist = new ArrayList<>(arraylist);

    }

    public Arraylist1() {

    }


}