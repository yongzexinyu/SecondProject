package com.hp.Io;
/*
* 刚刚的1-2是锁在普通方法上
* 现在要锁在 静态方法上 synchronized可以所在带 static的方法上
* */
public class ThreadSyncDemo03 {
    public static void main(String[] args) {
        Shop1 shop1=new Shop1();
       Thread t1= new Thread(){
            @Override
            public void run() {
                shop1.buy();
            }
        };
        Thread t2= new Thread(){
            @Override
            public void run() {
                shop1.buy();
            }
        };
        t1.start();t2.start();
    }
}
class Shop1{
    public synchronized static void buy(){
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName()+"选衣服");
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+"试衣服");
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("试完了");
    }
}