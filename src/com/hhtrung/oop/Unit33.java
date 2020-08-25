package com.hhtrung.oop;

public class Unit33 {
    public static void main(String[] args) {
        Unit33 u=new Unit33();
        System.out.println(u.add(3,5));
        System.out.println(u.add(3.5f, 5.4f));
    }

    public int add(int a, int b) {
        return a+b;

    }

    public float add(float a, float b) {
        return a+b;
    }
}
