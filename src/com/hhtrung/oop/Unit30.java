package com.hhtrung.oop;

public class Unit30 {
    public static void main(String[] args) {
        String test="Hello world";

        try {
            System.out.println("Before");
            System.out.println("show the location:=" + test.substring(50));
            System.out.println("After");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(e.toString());

        }


        try {
            System.out.println("Before1");
            int a = 5;
            int b = 0;
            System.out.println("Devide number" + a / b);
            System.out.println("After1");
        }
        catch (ArithmeticException e){ //this is runtime exception
            System.out.println(e.toString());
        }
        catch (Exception e){
            System.out.println("Should use this type for all exception types");
        }

        finally {
            System.out.println("Always show in finally");
        }
    }
}
