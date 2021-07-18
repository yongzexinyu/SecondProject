package IOThreadTest;

public class TestDaemonThread {
    public static void main(String[] args) {
        You1 you=new You1();
        God god=new God();
      Thread thread=new Thread(you);
      thread.start();
      Thread thread1=new Thread(god);
      thread1.setDaemon(true);//默认是false表示用户进程 正常的线程都是用户线程
        thread1.start();
    }
}
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝守护着你");
        }
    }
}
class You1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("每一天都开心的活着");
        }
        System.out.println("=======GOODBYE WORLD========");
    }
}