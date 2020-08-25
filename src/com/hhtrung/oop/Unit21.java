package com.hhtrung.oop;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Unit21 {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();

        a1.setName("TrungHo");
        System.out.println("a1="+a1.getName());


        a2.setName("Teo");
        System.out.println("a2="+a2.getName());

    }

    }



class A {
    private String name;
    public void setName(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }

}

