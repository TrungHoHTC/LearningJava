package com.hhtrung.session5;

public class Student {
    private String name = "Trung Ho";
    private int age= 40;
    private String gender = "Nam";

    public void showInfoStudent(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender:"+gender);
    }

    public int addNumber(int a, int b){

        int sum = a+ b;
        return sum;

    }

    public static void main(String[] args) {
        Student st=new Student();
        st.showInfoStudent();
        System.out.println("Sum of two numbers: "+ st.addNumber(3,5));

    }

}
