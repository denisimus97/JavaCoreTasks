package com.company.threadstasks;

public class Threads implements Runnable {

    @Override
    public void run() {
        while (true){
            System.out.println("Асинхронный привет!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }

            System.out.println("Асинхронный пока!");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }
}

