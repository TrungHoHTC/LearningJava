package com.hhtrung.oop;

public class Unit37 {

    enum colour { Red, green, yellow, pink};

    public static void main(String[] args) {
        colour e = colour.green;
        System.out.println(e);

        System.out.println(e.Red);

        if (e == colour.green) {
            System.out.println("True");
        }
        else {
            System.out.println("false");

        }

        switch (e) {
            case green:
                System.out.println("green");
            case Red:
                System.out.println("red");
            case pink:
                System.out.println("pink");
            case yellow:
                System.out.println("yellow");

        }



    }

}
