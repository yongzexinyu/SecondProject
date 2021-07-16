package com.hp.day09;

import java.io.File;
import java.util.Scanner;

public class Test05 {
    private static  File file;
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个目录名或文件名");
         String s = scanner.nextLine();
         file= new File(s);
      diGui(file);
    }
    public static  void  diGui(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                diGui(file1);
            }
            String name1 = file.getName();
            System.out.println("删除空文件夹 = " + name1);
            file.delete();
            System.out.println("");
        }else if(file.isFile()){
            String name = file.getName();
            System.out.println("删除文件"+name);
            file.delete();
        }
    }
}
