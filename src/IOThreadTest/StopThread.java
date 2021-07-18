package IOThreadTest;

public class StopThread implements Runnable{
    boolean flag=true;
    public void run() {
        int i=0;
        while (flag){
            System.out.println("执行力"+i+++"次");
        }
    }
    public void stop(){
        this.flag=false;
    }
    public static void main(String[] args) {
        StopThread stopThread=new StopThread();
        new Thread(stopThread).start();
        for (int i = 0; i <1000 ; i++) {
            if(i==900){
                stopThread.stop();
                System.out.println("线程该停止了");
            }
            System.out.println("主线程执行力"+i++);
        }
    }

}
