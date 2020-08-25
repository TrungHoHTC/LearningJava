package com.hhtrung.oop;

public class Unit28 {
    int number;
    final float PI=3.14f;

    public static void main(String[] args) {
        Unit28 test = new Unit28();
        test.number=15;
        //test.PI=4; //this is not changed

    }

    public void change(){
        number=10;
        //PI=4.5f; no change here

    }


}

class  Parent{
    static void show(){
        System.out.println("show");
    }

    final void move(){
        System.out.println("move");
    }

    void hide(){
        System.out.println("hide");
     }

}

class Children extends Parent{
    void hide(){
        System.out.println("hide child");
    }

    //The attributes, methods declared as static and final  are not override
    //void move(){
    ///}

    //Final class is not also inherit


}


