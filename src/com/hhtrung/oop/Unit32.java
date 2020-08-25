package com.hhtrung.oop;

public class Unit32 {
    public static void main(String[] args) {
        Building b = new Building();
        try {
            b.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyException extends Exception{
    //Do something
    public void print(){
        System.out.println("Test");
    }
}

class Building{
    public void show() throws MyException {
        int conn=100;
        //do something
        if (conn>10) {
            throw new MyException();
        }
    }
    public void go() throws InterruptedException {
        Thread.sleep(1000);

    }
}
