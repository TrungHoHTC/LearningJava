package com.hhtrung.Session8;

import com.sun.deploy.security.SelectableSecurityManager;

public class Demo {
    private String name;
    private int age;

    public boolean connectDatabase(String address, String username, String password){
        return true;

    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Demo dm=new Demo();

        dm.setAge(9);
        int st1= dm.getAge();

        if (st1>10 ) {
            System.out.println("The students are greater than 10 ages");

        } else
        {
            System.out.println("The students are smaller than 10 ages");

        }


        int a=8812;
        byte b=45;


       // b = (byte) a; //This will lose data on the variable a
        System.out.println("b=" + b+ "\n"+ "a= "+ a);

        int result = a+b;
        int c= a+=b;
        a-=b;
        a*=b;
        a/=b;

        System.out.println("Result="+result + "\n" + "Test="+c);



    }

}
