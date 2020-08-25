package com.hhtrung.oop;

public class Unit39 {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println(b.getSize());
        System.out.println(b.getColour());

        Box b1= new Box(20,"yellow");
        System.out.println(b1.getSize());
        System.out.println(b1.getColour());
    }
}


class Box {

    private int size;
    private String colour;

    public Box(){
        size=10;
        colour="green";
    }

    public Box(int size, String colour){
        this.size=size;
        this.colour=colour;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }
}
