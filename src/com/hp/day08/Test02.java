package com.hp.day08;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("$");
        list.add("2");
        list.add("$");
        list.add("3");
        list.add("$");
        list.add("4");
        /*
        一、Iterator的API
        关于Iterator主要有三个方法：hasNext()、next()、remove()
        hasNext:没有指针下移操作，只是判断是否存在下一个元素
        next：指针下移，返回该指针所指向的元素
        remove：删除当前指针所指向的元素，一般和next方法一起用，这时候的作用就是删除next方法返回的元素
        二、迭代器原理
        1、当创建完成指向某个集合或者容器的Iterator对象是，这是的指针其实指向的是第一个元素的上方，即指向一个           空
        2、当调用hasNext方法的时候，只是判断下一个元素的有无，并不移动指针
        3、当调用next方法的时候，向下移动指针，并且返回指针指向的元素，如果指针指向的内存中没有元素，会报异常。
        4、remove方法删除的元素是指针指向的元素。如果当前指针指向的内存中没有元素，那么会抛出异常。
        */
        Iterator<String> iterator = list.iterator();
         while (iterator.hasNext()){
             String next = iterator.next();
             if(next=="$") {
                 iterator.remove();
             }
      }
        System.out.println(list);
        for (String s : list) {
            System.out.println("s = " + s);
        }
    }
}
