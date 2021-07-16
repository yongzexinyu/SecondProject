package com.hp.day09;

import java.io.File;

public class Test06 {
    private  static  File[] files;
    public static void main(String[] args) {
        File file=new File("D://idea项目//SecondProject//src");
        diGui(file);
    }
    public  static  void diGui(File file){
            if(file.isDirectory()){
                files = file.listFiles();
                for (File file1 : files) {
                    diGui(file1);
                }
            }else if(file.isFile()){
                String name = file.getName();
                System.out.println("文件名为"+name);
            }
    }
}
