package com.hhtrung.oop;

public class Unit53 {
    public static void main(String[] args) {
        Unit53 un = new Unit53();
        System.out.println(un);
        System.out.println(un.toString());

        Unit52 un52= new Unit52();
        StringBuilder builder = new StringBuilder("Test");
        System.out.println(builder.toString());

    }

    //override
    public String toString(){
      return "This is an Unit53";
    }



}
