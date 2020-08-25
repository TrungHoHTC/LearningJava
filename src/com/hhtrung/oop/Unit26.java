package com.hhtrung.oop;

public class Unit26 {
    public static void main(String[] args) {
        Book bk = new Book();
        bk.show();

        ReferenceBook rb = new ReferenceBook();
        rb.move();
        rb.show();
        rb.verify();

    }
}

interface Document{
    void show();
    void verify();

}

interface ReferenceDoc extends Document{
    void hide();
    void correct();


}

class Book implements Document{
    public void show() {
        System.out.println("show in class Book");

    }

    @Override
    public void verify() {
        System.out.println("This is to verify....in Book class");

    }

}

class ReferenceBook extends Book{
    public void show(){
        System.out.println("show in Reference Book");

    }

    public void move(){


    }

}

class Paper implements Document{


    @Override
    public void show() {

    }

    @Override
    public void verify() {

    }
}

class ReferenceBookNew extends Book implements Document, ReferenceDoc{

    @Override
    public void hide() {

    }

    @Override
    public void correct() {

    }
}

