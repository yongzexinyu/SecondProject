package com.hp.day06;


import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你的邮箱地址");
        String s=sc.nextLine();
        int i = s.indexOf("@");
        String substring = s.substring(0, i);
        System.out.println(substring);
    }
}
