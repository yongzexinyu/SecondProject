package com.hp.data;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 企业开发中（java,bigData）日期
 * 日期类中的层是有一个long值 学名UTC时间
 * 1970年1月1日00：00：00开始  计算时间元年
 * 日期类  有2个包， sql/util ，我们用util包下的日期
 * 这个日期类  功能有限，如需 日期计算，需要使用
 * */
public class DataDemo01 {
    public static void main(String[] args) {
        //定义一个日期
      Date date=new Date();
      System.out.println("date = " + date);
      //toString()被改写了。。。。可以重新改为我们自己的时间
       long time =date.getTime();//获取 真实的时间 ，long 值
        System.out.println("time = " + time);
        //date.setTime(1661616161616L);
      //  System.out.println("date = " + date);
        
        //练习题:查看10天后是哪一天？
        time+=10*24*3600*1000L;
        date.setTime(time);
        System.out.println(date);
        //修改 日期显示格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println("format = " + format);
        //字符串 -----》转日期
        String dateStr="2018-9-97 23:13:45";
        try {
            Date parse = simpleDateFormat.parse(dateStr);
            String format1 = simpleDateFormat.format(parse);
            System.out.println("format1 = " + format1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
