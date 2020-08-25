package com.hhtrung.oop;

public class Unit24 {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.show();
        man.study();


    }
}

interface Human{
    public static final int  AVG_AGE=100;
    int AVG_WEITGH=60;
    public abstract void show();
    void study(); //this class is also abstract method

}


class Manager implements Human {

    @Override
    public void show() {
        System.out.println("AVG_AGE: "+AVG_AGE);

    }

    @Override
    public void study() {
        System.out.println("Weight:"+AVG_WEITGH);

    }
}