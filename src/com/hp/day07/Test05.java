package com.hp.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入身份证号");
            String s = sc.nextLine();
            if (s.matches("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)")) {
                flag=false;
                String year = s.substring(6, 10);
                String yue = s.substring(10, 12);
                String ri = s.substring(12, 14);
                String a = year + "-" + yue + "-" + ri;
                System.out.println("出生日期 = " + a);
                SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date parse = sft.parse(a);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse);
                    calendar.add(Calendar.YEAR, 20);
                    String format = sft.format(calendar.getTime());
                    System.out.println("20岁生日 = " + format);
                    calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
                    String format1 = sft.format(calendar.getTime());
                    System.out.println("本周周三的日期 = " + format1);

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("格式错误，请重新输入");
            }
        }
    }
}
