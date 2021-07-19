package IOThreadTest;

public class UnSafeBank {
    public static void main(String[] args) {
        //账户
        Acount acount=new Acount("结婚基金",100);
        drawMoney you=new drawMoney(acount,50,"你");
        drawMoney girlfriend=new drawMoney(acount,100,"女朋友");
        you.start();
        girlfriend.start();
    }
}
class Acount {//账户
    String name;//卡名
    int blance;//余额
    public  Acount(String name,int blance){
        this.blance=blance;
        this.name=name;
    }
}
class drawMoney extends Thread{
    Acount acount;//账户
    //取多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;
    public drawMoney(Acount acount,int drawingMoney,String name){
        super(name);
        this.acount=acount;
        this.drawingMoney=drawingMoney;
    }
    @Override
    public void run() {
        //判断有没有钱
        if(acount.blance-drawingMoney<0){
            System.out.println(Thread.currentThread().getName()+"钱不够了，取不了");
            return;
        }
        //sleep可以放大问题的发生性
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //卡里余额=余额-你取的钱
        acount.blance=acount.blance-drawingMoney;
        //你手里的钱
        nowMoney=nowMoney+drawingMoney;
        System.out.println(acount.name+"余额为"+acount.blance);
        //Thread.currentThread().getName()=this.getName();
        System.out.println(this.getName()+"手里的钱"+nowMoney);
    }
}