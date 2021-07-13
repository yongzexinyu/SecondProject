package com.hp.day06;

public class Test01 {
    public static void main(String[] args) {
        String str="HelloWorld";
        test1(str);
        test2(str);
        test3(str);
        test4(str);
        test5(str);
        String str1=" Hello ";
        test6(str1);
        test7(str);
        test8(str);
        test9(str);
    }

    private static void test9(String str) {
        String s = str.toUpperCase();
        System.out.println("s = " + s);
        String s1 = str.toLowerCase();
        System.out.println("s1 = " + s1);
    }

    private static void test8(String str) {
        boolean h = str.startsWith("h");
        System.out.println("h = " + h);
        boolean ld = str.endsWith("ld");
        System.out.println("ld = " + ld);
    }

    private static void test7(String str) {
        char c = str.charAt(5);
        System.out.println("c = " + c);
    }

    private static void test5(String str) {
        String substr = str.substring(5);
        System.out.println("substr = " + substr);
    }

    private static void test6(String str) {
        String trim = str.trim();
        System.out.println("trim = " + trim);

    }

    private static void test3(String str) {
        int o1 = str.indexOf("o",5);
        System.out.println("o1 = " + o1);
    }

    public static void test4(String str) {
        String substring = str.substring(0, 5);
        System.out.println("substring = " + substring);
    }

    public static  void test1(String str){
        int length = str.length();
        System.out.println(length);
    }
    public  static  void test2(String  str){
        int o = str.indexOf("o");
        System.out.println("o = " + o);
    }

}
