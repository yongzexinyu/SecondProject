package IOThreadTest;

public class ThreadYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }

    public static void main(String[] args) {
        ThreadYield threadYield=new ThreadYield();
        new Thread(threadYield,"小明").start();
        new Thread(threadYield,"小虎").start();
    }
}
