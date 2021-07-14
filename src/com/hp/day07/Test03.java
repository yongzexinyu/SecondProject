package com.hp.day07;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您的生日：");
        String str = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(str.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")) {
            try {
                Date birth = sdf.parse(str);
                Date now = new Date();
                long l = now.getTime() - birth.getTime();
                long l1 = l / (7 * 24 * 3600 * 1000);
                System.out.println("出生到现在经过了 = " + l1+"周");
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("格式错误");
        }
    }
}
