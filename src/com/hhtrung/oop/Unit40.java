package com.hhtrung.oop;

public class Unit40 {
    public static void main(String[] args) {
        ChildSup c = new ChildSup(2);

    }
}

class Supper{
    public Supper(int a){
        System.out.println("Test");
    }

   }

class ChildSup extends Supper{
    public ChildSup(int a){
              super(a);
        System.out.println("ChildSup");
    }

}

