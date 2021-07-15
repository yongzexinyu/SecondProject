package com.hp.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test07 {
    public static void main(String[] args) {
       /* ArrayList<Integer>  list=new ArrayList<>();
       Random r=new Random();
        for (int i = 0; i <10 ; i++) {
            int j = r.nextInt(100);
            list.add(j);
        }
        System.out.println("list = " + list);
        //排序方法sort(List)
        Collections.sort(list);
        System.out.println(list);*/
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}
