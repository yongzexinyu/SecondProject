package com.hp.day08;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
       /* List subList(int start,int end)
		 * 获取当前集合中的子集*/
        List<Integer> integers = list.subList(3, 7);
        System.out.println("integers = " + integers);
        for (int i = 0; i <integers.size() ; i++) {
            integers.set(i,integers.get(i)*10);
        }
        //修改子集会影响原集合
        System.out.println(list);
        List<Integer> integers1 = list.subList(7, 10);
        list.removeAll(integers1);
        System.out.println("list = " + list);
    }
}
