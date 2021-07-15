package com.hp.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person person1 = new Person();
        person1.setName("貂蝉");
        person1.setHeight(170);
        person1.setAge(18);
        Person person2 = new Person();
        person2.setName("小乔");
        person2.setHeight(170);
        person2.setAge(18);
        Person person3 = new Person();
        person3.setName("孙尚香");
        person3.setHeight(170);
        person3.setAge(18);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        System.out.println("list = " + list);
        
        ArrayList<String> arrayList = new ArrayList<>();
       /* for (int i = 0; i <list.size(); i++) {
            Object o = list.get(i);
            String name = ((Person) o).getName();
            arrayList.add(name);
        }
        System.out.println("arrayList = " + arrayList);*/
       List<String> collect = list.stream().map(Person::getName).collect(Collectors.toList());

       System.out.println("collect = " + collect);
    }
}
