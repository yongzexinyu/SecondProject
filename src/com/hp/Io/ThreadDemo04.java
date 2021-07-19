package com.hp.Io;

import java.util.Random;

public class ThreadDemo04 {
    static  int time=4;//炸弹的倒计时
    static  int password=new Random().nextInt(100);
    public static void main(String[] args) {
        System.out.println("炸弹的密码是"+password);

        //第一个线程:炸弹的倒计时，如果完成倒计时 就beng beng beng
       Thread t1= new Thread(){
           boolean flag=true;
           public void run() {
               while(flag) {
                   try {
                           Thread.sleep(1000);
                       if (time == 0) {
                           //flag=false;
                           System.out.println(this.getName() + "beng beng beng");
                           break;
                       }
                       time--;
                       System.out.println("倒计时"+time);
                       Thread.sleep(1000);
                   } catch (Exception e) {

                       if(e.getMessage().equals("sleep interrupted")){
                           System.out.println("拆弹成功");
                           break;
                       }
                   }
               }
           }
       };

        //第二个线程:是打断线程的倒计时，如果打断了，就不beng beng
        Thread t2=new Thread(){

            boolean flag=true;
            public void run() {
                while (flag){
                    if(password==new Random().nextInt(100)){
                        t1.interrupt();
                        flag=false;
                    }
                }
            }
        };
        t1.start();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
