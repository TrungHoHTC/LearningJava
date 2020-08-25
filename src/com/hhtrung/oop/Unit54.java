package com.hhtrung.oop;

public class Unit54 {
    public static void main(String[] args) {
        Thread thread= new Thread() {
            public void run() {
            try
            {
                System.out.println("Pause");
                Thread.sleep(3000);
                System.out.println("Restart");
            }
            catch(InterruptedException e)
            {
            }
        }

        };
        thread.start();

        myThread mythread = new myThread();
        mythread.start();

       // yourThead yourThead=new yourThead();
        //yourThead.run();

    }
}

class myThread extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Start run");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Continue");
        }

    }

}

class yourThead implements Runnable{
    @Override
    public void run() {
        System.out.println("Show in Runnable");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Show in Runnable 1");


    }
}
