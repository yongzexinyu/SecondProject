package com.hp.day10;



import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 implements Runnable{
    private static String format;

    public static void main(String[] args) {
        Test03 test03=new Test03();
        new Thread(test03).start();
    }

    @Override
    public void run() {
        while (true) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            format = simpleDateFormat.format(date);
            try {
                Thread.sleep(1000);
                System.out.println("当前时间为: " + format);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
