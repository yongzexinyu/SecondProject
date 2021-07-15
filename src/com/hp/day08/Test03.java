package com.hp.day08;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list.get(1));
        list.set(2,"3");
        System.out.println("list = " + list);
        list.add(1,"2");
        System.out.println("list = " + list);
        list.remove(2);
        System.out.println("list = " + list);
    }
}
