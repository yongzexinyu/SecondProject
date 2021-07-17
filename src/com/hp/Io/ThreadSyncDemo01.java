package com.hp.Io;

/*
* 多个线程同时操作一个资源诞生的安全问题
* 比如:多个账户抢票
* */
public class ThreadSyncDemo01 {
    public static void main(String[] args) {
        Tickers tickers=new Tickers();
        Thread t1=new Thread(){
            @Override
            public void run() {
                //模拟 黄牛1 取票
                while (true){
                    int ticket=tickers.getTicket();
                  //  Thread.yield();//线程让一让
                    System.out.println(this.getName()+"线程拿了" + ticket);

                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                //模拟 黄牛1 取票
                while (true){
                    int ticket=tickers.getTicket();
                   // Thread.yield();//线程让一让
                    System.out.println(this.getName()+"线程拿了" + ticket);

                }
            }
        };
        t1.start();t2.start();
    }
}
class Tickers{
    private  int  ticket=20;

    public synchronized int getTicket() {
        if(ticket==0){
            System.out.println("票没有了");
           throw  new RuntimeException("票没有le");
        }
        Thread.yield();//线程的让一让
        return ticket--;
    }
}