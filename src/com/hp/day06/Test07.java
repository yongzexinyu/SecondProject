package com.hp.day06;

public class Test07 {
    public static void main(String[] args) {
        testSubString("www.lol.game.qq.com.cn");
    }
    private static void  testSubString(String str){
        int com1= str.lastIndexOf("com");
        String substring = str.substring(4, com1-1);
        System.out.println(substring);
    }
}
