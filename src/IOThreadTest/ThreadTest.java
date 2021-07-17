package IOThreadTest;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ThreadTest extends Thread {
    private  String name;//保存图片的名字
    private String url;//网络图片地址
    private ThreadTest(String url,String name){
        this.url=url;
        this.name=name;
    }

    @Override
    public void run() {
        WebDownload webDownload=new WebDownload();
        webDownload.downloader(url,name);
    }

    public static void main(String[] args) {
        ThreadTest threadTest=new ThreadTest("https://ss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/zhidao/pic/item/f9198618367adab4822c6c238fd4b31c8601e4d6.jpg","1.jpg");
        threadTest.start();
    }
}
class WebDownload {
    public  void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，download方法异常");
        }
    }
}
