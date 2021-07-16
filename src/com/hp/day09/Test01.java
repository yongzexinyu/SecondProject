package com.hp.day09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        File file=new File("./test.txt");
        String name = file.getName();
        System.out.println("name = " + name);
        long length = file.length();
        System.out.println("length = " + length);
        Calendar calendar=Calendar.getInstance();
        //LastModified()方法用一个长整型值来代表文件最后一次被修改的时间，
        // 其实返回的是文件修改时的时刻与00:00:00 GMT, January 1, 1970的差值(用毫秒计)，
        // 所以可以用Date类的构造方法Date(long date)输出。
        // 其中要传递的形参就是某一时刻与00:00:00 GMT, January 1, 1970的差值(用毫秒计)。
        calendar.setTimeInMillis(file.lastModified());
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:ss:ss");
        String format = simpleDateFormat.format(time);
        System.out.println("最后修改时间为 = " + format);

    }
}
