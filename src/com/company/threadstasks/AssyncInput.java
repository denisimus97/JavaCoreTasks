package com.company.threadstasks;

public class AssyncInput {
    public static void main(String[] args)
    {
        Thread thread = new Thread(new Threads());
        thread.start();
        while (true)
        {
            System.out.println("Работает основная программа");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
