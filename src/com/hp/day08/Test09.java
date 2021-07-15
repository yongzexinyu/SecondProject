package com.hp.day08;

import com.hp.collection.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入员工信息");
        String s = sc.nextLine();
        String[] split = s.split(";");
        StaffInfo[] staff=new StaffInfo[split.length];///建立多个person对象
        for (int i = 0; i <split.length ; i++) {
            String[] split1 = split[i].split(",");
            String name=split1[0];//姓名
            String age=split1[1];
            Integer age1 = Integer.valueOf(age);//年龄
            String sex=split1[2];//性别
            String salary=split1[3];
            Integer  salary1= Integer.valueOf(salary);//薪资
            String hiredate=split1[4];
            //将每个员工信息解析成StaffInfo对象。并存入到一个数组中
            staff[i]=new StaffInfo(name,age1,sex,salary1,hiredate);
        }
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i]);
            String hiredate = staff[i].getHiredate();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date parse = simpleDateFormat.parse(hiredate);
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(parse);
                calendar.add(Calendar.MONTH,3);
                calendar.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
                Date time = calendar.getTime();
                String format = simpleDateFormat.format(time);
                System.out.println("转正日期为当周周五"+format);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }


    }
}
