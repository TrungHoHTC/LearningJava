package com.hhtrung.oop;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

public class Unit25 {
    public static void main(String[] args) {
        Boss bo = new Boss();
        System.out.println("Name="+ bo.name);
        System.out.println("Address="+ bo.address);
        System.out.println("Age="+ bo.age);
        //System.out.println("Name="+ bo.numofWives); //this is error when using the private attribute

        bo.showWife();
        bo.showName();
        bo.showAddress();
        //bo.showAge(); //error here when using the private method

    }

}

class Boss{
    //every where
    public int age;
    // same package and its sub-classes
    protected String name;
    //same package
    String address;
    //only for its
    private int numofWives;

    public void showName(){
        System.out.println(name);
    }

    private void showAge(){
        System.out.println(age);
    }

    protected  void showAddress(){
        System.out.println(address);
    }

    public void showWife(){
        System.out.println(numofWives);
    }

}
