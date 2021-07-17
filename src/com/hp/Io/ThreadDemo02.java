package com.hp.Io;

public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable xicai=new xiCai();
        Runnable shaoShui=new shaoShui();
        Thread xicaiThread=new Thread(xicai);
        Thread shaoShuiThread=new Thread(shaoShui);
        xicaiThread.start();
        shaoShuiThread.start();
    }
}
class xiCai implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            System.out.println("洗了菜" + i);
        }
    }
}
class shaoShui implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            System.out.println("烧水" + i);
        }
    }
}