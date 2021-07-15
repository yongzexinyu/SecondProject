package com.hp.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JDK8demo01 {
    /*
    * Stream的操作流程
    * 1.创建Stream
    * 2.中间操作
    * 3.终止操作
    * */
//创建Stream方法
    //1.通过Collection接口的stream()方法进行创建
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Stream<Integer> stream = list.stream();
        //2.通过Arrays下的静态方法创建
        StaffInfo[] staffInfos=new StaffInfo[10];
        Stream<StaffInfo> stream1 = Arrays.stream(staffInfos);

        List<StaffInfo> list1=Arrays.asList(
                new StaffInfo("张三",18,"男",8000,"2001-2-21"),
                new StaffInfo("李四",18,"男",8000,"2001-2-21"),
                new StaffInfo("王五",28,"男",8000,"2001-2-21"),
                new StaffInfo("赵六",10,"男",8000,"2001-2-21"),
                new StaffInfo("田七",38,"男",8000,"2001-2-21"),
                new StaffInfo("田七",12,"男",8000,"2001-2-21")
        );
        Stream<StaffInfo> stream2 = list1.stream();
        //中间操作
        //stream2.distinct().forEach(System.out::println);//去重
        //stream2.filter(a -> a.getAge()>30).forEach(System.out::println);//过滤

        //终止操作
        //void forEach(Consumer<?  super T> action):遍历数据
        //stream2.forEach(System.out::println);
       /* boolean allMath=stream2.allMatch(a -> a.getAge()==18);//匹配流中数据是否完全符合断言式接口条件
        System.out.println("allMath = " + allMath);*/
       
       
       //stream2.collect()流中数据的转换
      //  List<StaffInfo> collect = stream2.collect(Collectors.toList());//将流中数据转换为List集合
       // System.out.println("collect = " + collect);
        //long count():求流中数据的数量;
       // long count = stream2.count();
       // System.out.println("count = " + count);
        /*StaffInfo staffInfo = stream2.findAny().get();//查找任意一个
        System.out.println("staffInfo = " + staffInfo);*/
    }

}
