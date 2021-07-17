package com.hp.Io;

import java.io.File;

public class IOSelectFileDemo01 {
    private static long size = 0;
    private static File[] files;

    /*
    * io能创建文件,也能创建文件夹
    * 还能查看文件
    * */
    public static void main(String[] args) {
        File file=new File(".");

//有什么样的方法可以 全部 查看所有的文件呢?
      diGui(file);
        System.out.println(size+"字节");
    }
    public  static  long diGui(File file) {

        File[] files = file.listFiles();

        for (File file1 : files) {
            if (file1.isDirectory()) {

                diGui(file1);
            } else if (file1.isFile()) {
                String name = file1.getName();
                System.out.println("文件名为= " + name);
                size += file1.length();
            }
        }
        return  size;
    }

}
