package com.hhtrung.oop;

public class Unit57 {

    {
        System.out.println("Block code 1");
    }

    public static void main(String[] args) {
        Unit57 unit= new Unit57();
    }

    public Unit57(){
        System.out.println("Constructor");
    }



    {
        System.out.println("Block code 2");
    }

    static {
        System.out.println("Block code 3");
    }

    static {
        System.out.println("Block code 4");
    }

}


