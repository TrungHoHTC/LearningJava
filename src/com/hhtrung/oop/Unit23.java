package com.hhtrung.oop;

public class Unit23 {
    public static void main(String[] args) {
        Outer ou = new Outer();
        ou.show();

        UsingOuter us = new UsingOuter();
        us.show();
    }
}

class Outer{
    public void show(){
        Inner in = new Inner();
        in.display();
    }

    class Inner{
        public void display(){
            System.out.println("I am Trung Ho");
        }

    }

}

class UsingOuter{
    public void show(){
        Outer.Inner in = new Outer().new Inner();
        in.display();

    }


}
