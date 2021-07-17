package IOThreadTest;
//模拟龟兔赛跑
public class Race implements Runnable {

//胜利者
    private static  String winner;
    public void run() {
        //判断比赛是否结束
        for (int i = 1; i <= 100; i++) {
            boolean flag=gameOver(i);
            if(flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->跑了第"+i+"步");
        }
    }
    //判断是否完成比赛
    private boolean gameOver(int steps){
        //判断是否有胜利者
        if(winner!=null){
            return true;
        }{
            if(steps>=100){
                winner=Thread.currentThread().getName();
                System.out.println("winner is" + winner);
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        Race race=new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
