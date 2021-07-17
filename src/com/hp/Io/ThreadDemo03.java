package com.hp.Io;
/*
* 线程创建的 超级好用  匿名内部类
* 线程创建的方式3
* */
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10000 ; i++) {
                    System.out.println("洗了菜" + i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10000 ; i++) {
                    System.out.println("烧水" + i);
                }
            }
        }.start();
    }
}
