package com.hp.data;

import java.util.Calendar;

/*
* 日历类: 可以做日期的计算
* 使用场景 在项目中：预约功能，日期功能计算
* 常用的APP 美柚,疫苗预约，入职日期计算，旅游模块
* 创建对象  ---》new 出来。。的
* 对象如果不能被（无参)new:  1)无参构造私有化了，可能是单例模式
*                           2）该类可能是个  接口/抽象类,必须new机实现类(子类)
* */
public class CalendarDemo01 {
    public static void main(String[] args) {
        //创建对象  不仅仅只有new，还有   类的实例方法
        //calendar包含了date的大部分功能 是date的升级版
        Calendar instance = Calendar.getInstance();

        System.out.println("instance = " + instance);
        instance.add(Calendar.YEAR,10);
        System.out.println("instance.getTime() = " + instance.getTime());
    }
}
