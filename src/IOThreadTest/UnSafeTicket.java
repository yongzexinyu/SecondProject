package IOThreadTest;

public class UnSafeTicket {
    public static void main(String[] args) {

        You2 you2=new You2();
         new Thread(you2,"小明").start();
         new Thread(you2,"小红").start();
         new Thread(you2,"小虎").start();

    }
}
class You2 implements  Runnable{
int ticket=10;//票数
    boolean flag=true;
    public void run() {
        while (flag) {
            if (ticket < 0) {//是否有票
                flag=false;
                return;
            }
            System.out.println(Thread.currentThread().getName() + "买了第" + ticket-- + "票");
        }
    }
}