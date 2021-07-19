package com.hp.Io;
/*
* 线程的打断
* 背景: 1.超阳： 爱吃 大肘子***100块
*       2.杨元辉：打断 超阳
*
*
* */
public class ThreadDemo05 {
    public static void main(String[] args) {
        Thread chaoYang=new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while (true) {
                    try {
                        System.out.println("爱吃大肘子"+i);
                        i++;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            if(e.getMessage().equals("sleep interrupted")){
                                System.out.println("停止吃肘子");
                                break;
                            }
                            e.printStackTrace();

                        }
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }
            }
        });
        chaoYang.start();
        Thread yangyuanhui=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                chaoYang.interrupt();//打断超阳
            }
        });
        yangyuanhui.start();
    }
}
