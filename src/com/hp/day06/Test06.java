package com.hp.day06;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要计算的表达式");
            String s = sc.nextLine();
            char c = s.charAt(1);
            String s1 = String.valueOf(c);
            if (s1.equals("+")) {
                System.out.println(jia(s));
            } else if (s1.equals("-")) {
                System.out.println(jian(s));
            } else if (s1.equals("*")) {
                System.out.println(cheng(s));
            } else if (s1.equals("/")) {
                System.out.println(chu(s));
            }
        }
    }
    public static int jia(String str){

     String[] st=str.split("\\+");
        Integer integer = Integer.valueOf(st[0]);
        Integer integer1 = Integer.valueOf(st[1]);
        return  integer+integer1;
    }
    public static int jian(String str){

       String[] st=str.split("-");
        Integer integer = Integer.valueOf(st[0]);
        Integer integer1 = Integer.valueOf(st[1]);
        return integer-integer1;
    }
    public static int cheng(String str){
        String[] st=str.split("\\*");
        Integer integer = Integer.valueOf(st[0]);
        Integer integer1 = Integer.valueOf(st[1]);
        return integer*integer1;
    }
    public static int chu(String str){
        String[] st=str.split("\\/");
        Integer integer = Integer.valueOf(st[0]);
        Integer integer1 = Integer.valueOf(st[1]);
        return integer/integer1;
    }
}
