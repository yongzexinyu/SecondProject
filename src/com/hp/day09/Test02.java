package com.hp.day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Test02 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名");
    String s = scanner.nextLine().trim();
    File file=new File(s);
    boolean exists = file.exists();
    if(exists) {
        String name = file.getName();
        int i = name.indexOf(".");
        String qian = name.substring(0, i);
        String hou = name.substring(i);
        boolean flag = true;
        int j = 0;
        while (flag) {
            j++;
            String xin = qian + "_副本" + j + hou;
            File file1 = new File(xin);
            boolean exists1 = file1.exists();
            if (exists1) {
            } else {
                try {
                    file1.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                flag = false;
                System.out.println(file1 + "创建成功");
            }
      /*  String[] split = name.split(".");
      //  Arrays.asList(split).forEach(System.out::println);
       // Arrays.stream(split).forEach(System.out::println);
        List<String> list = Arrays.asList(split);
        System.out.println(list.get(0));*/
        }
        }else{
        try {
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println(file + "创建成功");
            } else {
                System.out.println("创建失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }
}
