package com.hhtrung.session13;

public class SwitchDemo {

    public static void main(String[] args) {

        //Switch loop
        int age =10;
        switch (age){
            case 0:
                System.out.println("Zero");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Default");
                break;
          //char, byte, short or int for switch
        }

        // For loop
        int i=0;
        for (;i<10;i+=2) {

            System.out.println("The value i="+i);
        }

        System.out.println("outer i="+i);


        //While loop
        i=0;
        while (i<10) {
            System.out.println("New value i=:" + i);
            i++;
        }

        //Do-while loop
        i=0;
        do {

            System.out.println("vaulue="+i);
            i++;
        } while (i<10);



    }
}
