package com.hp.day08;


import java.util.Arrays;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        String[] array={"one","two","three"};
        //将数组转为集合
        List<String> strings = Arrays.asList(array);
        System.out.println("strings = " + strings);

    }
}
