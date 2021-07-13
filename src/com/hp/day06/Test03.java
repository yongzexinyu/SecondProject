package com.hp.day06;

public class Test03 {
    public static void main(String[] args) {
        String str="上海自来水来自上海";
        String str1="本日飞机飞日本";
        System.out.println(check(str));
        System.out.println(check(str1));

    }

    private static boolean check(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(sb.reverse().toString().equals(str)){
            return  true;
        }else{
            return  false;
        }
    }

}
