package com.hhtrung.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class Unit52 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("TRung");
        al.add("Candy");
        al.add("Britney");

        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }


    }
}
