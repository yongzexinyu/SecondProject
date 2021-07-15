package com.hp.day08;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        /*
        将集合转换为一个Integer数组并输出数组每一个元素
         */
        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
        

    }
}
