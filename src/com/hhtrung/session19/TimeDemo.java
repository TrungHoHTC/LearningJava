package com.hhtrung.session19;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {
    public static void main(String[] args) {

        //Get time by millis
        long start = System.currentTimeMillis();
        try {
            for(int i=0;i<1000;i++){
             Thread.sleep(2);
            }

        } catch (Exception e) {

        }
        long end = System.currentTimeMillis();

        System.out.println("Milis Delay="+ (end-start));

        //Get time by nanosecond
        start = System.nanoTime();
        end = System.nanoTime();
        System.out.println("Nano Delay="+ (end-start));


        //Get time from system
        DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String day = dateFormat.format(date);
        System.out.println(day);








    }
}
