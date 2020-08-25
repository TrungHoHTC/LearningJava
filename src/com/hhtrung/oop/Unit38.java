package com.hhtrung.oop;


public class Unit38 {
    enum COLOUR {
        red(5), blue(6), green(7), pink(8);
        private int value;

        COLOUR(int value){
            this.value=value;

        }

        public int getValue() {
            return value;
        }

    }


    public static void main(String[] args) {
        COLOUR c = COLOUR.blue;
        System.out.println("The value c= "+ c);
        System.out.println("The value c= "+ c.getValue());

    }

}
