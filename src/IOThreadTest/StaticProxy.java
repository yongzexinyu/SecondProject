package IOThreadTest;

public class StaticProxy {
    public static void main(String[] args) {
        You you=new You();//你要租房
/*new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("你要租房子");
    }
}).start();*/

      //  new Thread( ()-> System.out.println("你要租房子")).start();
        Proxy  proxy=new Proxy(you);
        proxy.zufangzi();
    }

}
interface zuFang{
    void zufangzi();
        }
        //真实角色  你去租房
class You  implements  zuFang{
    public void zufangzi() {
        System.out.println("租房子");
    }
}
//代理  帮助你租房
class Proxy implements zuFang{
private  zuFang targer;
public Proxy(zuFang targer){
    this.targer=targer;
}
    @Override
    public void zufangzi() {
             befor();
        this.targer.zufangzi();
             after();
    }

    private void after() {
        System.out.println("交房租");
    }

    private void befor() {
        System.out.println("找到房东");
    }
}