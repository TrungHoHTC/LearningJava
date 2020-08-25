package com.hhtrung.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Unit50 {
    public static void main(String[] args) {
        ArrayList<BB> al = new ArrayList<BB>();

        al.add(new BB());
        al.add(new BB());
        al.add(new BB());

        for (int i = 0; i < al.size(); i++) {
           al.get(i).show();
        }

        HashMap<String, AA> hm = new HashMap<String, AA>();
        hm.put("Key1", new AA());
        hm.put("Key2", new AA());
        hm.put("Key3", new AA());
        hm.put("Key4", new AA());

        System.out.println("THe value of key1="+ hm.get("key1"));


        Vector<C> vector= new Vector<C>();

        vector.add(new C());
        vector.add(new C());
        vector.add(new D());

        Vector<D> vector1= new Vector<D>();
        vector1.add(new D());
        vector1.add(new D());

    }
}

class AA {
    public void go(){
        System.out.println("Go");
    }

}

class BB {
    public BB(){
        System.out.println("Constructor of BB");

    }
    public void show(){
        System.out.println("Using generic to show data");
    }
}

class C{

}

class D extends C{

}