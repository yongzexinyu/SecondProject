package com.hp.day09;

import java.io.File;
import java.util.Scanner;

public class Test04 {
    private static File[] files;
    private static File file1;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入目录名");
        String s = sc.nextLine();
        file1=new File(s);
        diGui(file1);
    }
    public static void diGui(File file1){
        files = file1.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                System.out.println("目录名为"+file.getName());
                diGui(file);
            }else if(file.isFile()){
                System.out.println("文件名为"+file.getName());
            }
        }
    }
}
