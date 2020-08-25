package com.hhtrung.oop;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Unit27 {
    public static void main(String[] args) {
        Information in1 = new Information();
        in1.number=200;
        in1.age=40; //once changed, it will effect from this
        System.out.println("Information 1: "+ in1.age + " " + in1.number);



        Information in2 = new Information();
        in2.number=300;
        System.out.println("Information 2: "+ in2.age + " " + in2.number);


        Information in3 = new Information();
        System.out.println("Information 3: "+ in3.age + " " + in3.number);



        Information.show();

        Information in4 = new Information();
        System.out.println("Information 4: "+ in4.age + " " + in4.number);



    }

}

class Information{
    int number=100;
    static int age=30;

    public static void  show(){
        System.out.println("show full here");
        age=80;
        //number=5; this is an error since the static method only uses static variables, not others

    }

    public void move(){


    }


}

class People extends Information{
    //public void show(){

    //} This is unacceptable since the method 'show' is static in super class, it is not re-defined in other class

    public void move(){


    }

}


