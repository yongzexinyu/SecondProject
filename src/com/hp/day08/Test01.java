package com.hp.day08;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        ArrayList<String> list2=new ArrayList<>();
        list1.add("four");
        list1.add("five");
        list1.add("six");
        for (int i=0;i<list2.size();i++) {
            list1.add(list2.get(i));
        }
        System.out.println(list1);
        ArrayList<String> list3=new ArrayList<String>();
        list3.add("one");
        list3.add("five");
        System.out.println(list3);
        //contains("元素"),containsAll(集合）
        boolean con = list1.containsAll(list3);
        if(con==true){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }
        list1.remove("two");
        System.out.println(list1);
    }
}
