package com.hp.sortList;

import java.util.ArrayList;;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class sortListDemo01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(501);
        list.add(500);
        list.add(50);
        list.add(35);
        list.add(80);
        list.add(0);
        list.add(15);
        Collections.sort(list);
        System.out.println("list = " + list);

        Person person1=new Person();
        person1.setName("张三");
        person1.setAge(50);
        person1.setHeight(175);
        Person person2= new Person();
         person2.setName("李四");
         person2.setAge(85);
        person2.setHeight(165);
        Person person3=new Person();
         person3.setName("王五");
         person3.setAge(15);
         person3.setHeight(185);
         Person person4= new Person();
         person4.setName("赵六");
        person4.setAge(5);
         person4.setHeight(170);
         List<Person> list1=new ArrayList<Person>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);
        list1.add(person4);
        list1.stream().sorted(Comparator.comparingInt(Person::getHeight)).forEach(System.out::println);
      /*  Collections.sort(list1);
        System.out.println("list1 = " + list1);
        Collections.reverse(list1);
        System.out.println("list1 = " + list1);*/
    }
}
