package com.hp.day06;

public class Test02 {
    public static void main(String[] args) {
        String str="大家好！";
        StringBuilder sb=new StringBuilder(str);
        sb = sb.append("我是程序员！");
        System.out.println(sb);
        sb.insert(6,"优秀的");
        System.out.println("sb = " + sb);
        sb.replace(6,9,"牛牛的");
        System.out.println("sb = " + sb);
        sb.delete(0,4);
        System.out.println("sb = " + sb);
        
    }
}
