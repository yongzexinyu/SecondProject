package IOThreadTest;

public class TestJoin implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程vip来了"+i);
        }

    }

    public static void main(String[] args) {
        TestJoin testJoin=new TestJoin();
       Thread thread= new Thread(testJoin);
       thread.start();
        for (int i = 0; i <500 ; i++) {

            if(i==200){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main线程"+i++);
        }
    }
}
