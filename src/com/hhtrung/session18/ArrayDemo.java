package com.hhtrung.session18;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] arrInt1 = new int[10];
        int []  arrInt2 = {2,3,4,5,6};

        int [][] arrInt3 = new int[3][4];

        for(int i=0; i < 3; i++) {
            for(int j=0; j < 4; j++) {
                System.out.println(arrInt3[i][j] + " " );
                            }
            System.out.println("");
        }
    }
}
