package com.hp.day07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println("format = " + format);
    }
}
