package com.hhtrung.oop;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Unit36 extends Tutorial36{
    public static void main(String[] args) {
        Unit36 un = new Unit36();
        System.out.println(un.calculate(3,6));
    }

    public Unit35 create() throws FileNotFoundException {
        return new Unit35();
    }


}

class Tutorial36{
    void display(){
        System.out.println("Banana is delicious");
    }

    int calculate(int a, int b){
        return a + b;
    }

    public Tutorial35 create() throws IOException{
        return new Tutorial35();


    }


}