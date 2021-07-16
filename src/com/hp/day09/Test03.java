package com.hp.day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要创建的目录名字");
         String s = scanner.nextLine();
          File file=new File(s);
            boolean exists = file.exists();
            if(exists){
                System.out.println("目录已经存在");
                String name = file.getName();
                boolean flag=true;
                int i=0;
                while (flag){
                    i++;
                    String xin=name+"_副本"+i;
                    File file1 = new File(xin);
                    boolean exists1 = file1.exists();
                    if(exists1){
                    }else{
                        boolean mkdir = file1.mkdir();
                        if(mkdir){
                            System.out.println(file1+"目录创建成功");
                        }
                        flag=false;
                    }
                }
            }else{
                boolean mkdir = file.mkdir();
                if(mkdir){
                    System.out.println(file+"目录创建成功");
                }
            }
    }
}
