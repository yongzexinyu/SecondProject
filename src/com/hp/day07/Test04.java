package com.hp.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入生产日期");
        String s = sc.nextLine();
        if(s.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")) {
            System.out.println("请输入保质期天数");
            int tianShu = sc.nextInt();
            SimpleDateFormat sft=new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date parse1= sft.parse(s);
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(parse1);
                calendar.add(Calendar.DAY_OF_YEAR,tianShu);
                calendar.add(Calendar.DAY_OF_YEAR,-14);
                calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
                String format = sft.format(calendar.getTime());
                System.out.println("商品过期两周前周三日期 = " + format);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("格式错误");
        }
    }
}
