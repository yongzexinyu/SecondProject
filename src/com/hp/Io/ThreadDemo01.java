package com.hp.Io;
/*
* 创建线程的第一种方式 : 缺点:直接继承Thread 那么浪费一次继承的机会
*
* */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread t1=new HotWaterThread();//创建一个线程
        Thread t2=new xiCaiThread();
        t1.start();
        t2.start();
        //像这样的 坐一会儿洗菜，坐一会烧水 那麽这就叫做 异步
        //如果是 把水全部完成，再做洗菜，这个叫做  同步  同步是有先后顺序的
    }
}
//如果只单单new Thread,他只是一个线程，线程中没有方法（任务),没意义
//需要自己 创建一个线程，继承他的任务（方法)
//线程中最有意义的是run方法！！
class HotWaterThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("烧了" + i+"瓶水");
        }
    }
}
class xiCaiThread extends  Thread{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("洗了" + i+"棵大白菜");
        }
    }
}