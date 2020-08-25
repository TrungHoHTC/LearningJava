package com.hhtrung.oop;

public class Unit55 {
    public static void main(String[] args) {
        THread55 thread55 = new THread55();
        Thread thread1 = new Thread(thread55);
        Thread thread2 = new Thread(thread55);

        thread1.setName("Trung");
        thread2.setName("Denny");

        thread1.start();
        thread2.start();

    }
}

class THread55 implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5);
                System.out.println(Thread.currentThread().getName()+ " "+ i);
            }
        }
        catch (Exception r){}

    }
}