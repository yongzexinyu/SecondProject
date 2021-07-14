package com.hp.day07;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println("date = " + date);
        time+=3*24*3600*1000L;
        date.setTime(time);
        System.out.println("date="+date);


    }
}
