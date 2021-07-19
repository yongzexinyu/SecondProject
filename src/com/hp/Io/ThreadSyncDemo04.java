package com.hp.Io;

public class ThreadSyncDemo04 {
    public static void main(String[] args) {


    Shop2 shop2=new Shop2();
    Thread t3=new Thread(){
        @Override
        public void run() {
            try {
                shop2.buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    Thread t4=new Thread(){
        @Override
        public void run() {

                shop2.buy2();

        }
    };
    t3.start();
    t4.start();
    }

}
class  Shop2{
    //如果，不加上synchronized 锁，完了
    public  void buy() throws InterruptedException {
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName()+"xxx正在选衣服");
        Thread.sleep(5000);
        synchronized (this){//使用 synchronized 块，锁在 关键位置
            System.out.println(thread.getName()+"进入试衣间 试衣服");
            Thread.sleep(5000);
            System.out.println("test over");
        }
    }
    public synchronized void buy2()  {
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName()+"xxx正在买冰淇淋");

    }
}
