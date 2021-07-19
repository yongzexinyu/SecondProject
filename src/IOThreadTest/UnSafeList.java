package IOThreadTest;

import java.util.ArrayList;
import java.util.List;
//线程不安全的集合
public class UnSafeList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        for (int i = 0; i <10000 ; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(list.size());
    }
}
