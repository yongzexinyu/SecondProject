package com.hp.day10;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        File file=new File(".");
       diGui(file);
    }
    private  static  void diGui(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                diGui(file1);
            }else if(file1.isFile()){
                String name = file1.getName();
                if(name.contains("java")){
                    System.out.println("文件名为 = " + name);
                }
            }
        }
    }
}
