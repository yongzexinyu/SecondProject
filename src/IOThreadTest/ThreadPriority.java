package IOThreadTest;

public class ThreadPriority extends  Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "的优先级" + Thread.currentThread().getPriority());

       MyPriority myPriority=new MyPriority();
        Thread t1 = new Thread(myPriority);
       Thread t2=new Thread(myPriority);
       Thread t3=new Thread(myPriority);
       Thread t4=new Thread(myPriority);

       t1.start();

       t2.setPriority(1);
       t2.start();

       t3.setPriority(Thread.MAX_PRIORITY);
       t3.start();

       t4.setPriority(6);
       t4.start();
    }
}
class  MyPriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"的优先级"+Thread.currentThread().getPriority());

    }
}