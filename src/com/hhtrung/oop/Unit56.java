package com.hhtrung.oop;

public class Unit56 {
    public static void main(String[] args) {
        THread56 thread56 = new THread56();
        Thread thread1 = new Thread(thread56);
        Thread thread2 = new Thread(thread56);

        thread1.setName("Trung");
        thread2.setName("Denny");

        thread1.start();
        thread2.start();

    }
}

class THread56 implements Runnable{

    private int money=100;

    @Override
    public synchronized void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5);
                System.out.println(Thread.currentThread().getName()+ " "+ i + " "+ money--);
            }
        }
        catch (Exception r){}

    }
}