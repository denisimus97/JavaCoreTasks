package com.company.exception;

public class Exeptionselem {
    /*Exceptions:
- Представим, что у нас есть ArrayList, в который нельзя
 добавлять больше чем 10 элементов. Нужно разработать свой
  собственный класс исключения (наследник от Exception),
   которое будет выкидываться при попытке добавления 11го
    элемента. В данном классе постараться переопределить как
     можно больше методов класса Throwable (4 и более).
     */

    public static void main(String[] args)
    {

        Arraylist1<Integer> arlist = new Arraylist1<>();
        for (int i = 0; i < 14; i++)
        {
            try
            {
                arlist.add(i);
            } catch (Myexeption myexeption)
            {
                myexeption.printStackTrace();
            }

        }
    }
}
