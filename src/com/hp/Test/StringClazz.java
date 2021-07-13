package com.hp.Test;

public class StringClazz {
    public static void main(String[] args) {
        //注意: ==比较的是 是否是同一个对象
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);
        //true 原因s2重用了S1的对象
        s1=s1+"1";
        System.out.println(s1==s2);//false
        //原因 1.根本不相等  2.深层原因，对象被修改了
        String s3="a"+"bc";
        System.out.println(s2==s3);//true
        //原因：字符串的链接 就等于 没链接
        String s4=new String("abc");
        String s5=new String("abc");
        System.out.println(s4==s2);//false
        //原因： s2是常量池中的字符串，而 new String 是 类
        System.out.println(s4);
        System.out.println(s4==s5);//false
        //原因： s4 和 s5 是不同的 对象
        System.out.println(s4.equals(s5));//true
        System.out.println(s4.equals(s2));//true
        //原因: == 比较的是  内存地址     equals比较的是2者是否相同
        //例子: 有2对长得一样的双胞胎：  == 比较的是DNA   equals  比较的是颜值
    }
}
