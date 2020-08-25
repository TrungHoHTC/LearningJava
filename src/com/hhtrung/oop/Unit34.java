package com.hhtrung.oop;

public class Unit34 extends Tutorial {
    public static void main(String[] args) {
        Unit34 u=new Unit34();
        System.out.println(u.add(3,5));
        System.out.println(u.add(3.5f, 5.4f));
        System.out.println(u.add("Trung", "handsome"));



    }

    public int add(int a, int b) {
        return a+b;

    }

    public float add(float a, float b) {
        return a+b;
    }
}

class Tutorial{
    public String add( String str1, String str2) {
        return str1 + str2;

    }


        }
