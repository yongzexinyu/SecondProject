package com.hp.day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<Date> list=new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入日期");
            String sc = scanner.nextLine();
            SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date parse = s.parse(sc);
                list.add(parse);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        Collections.sort(list);
        for (Date date : list) {
            System.out.println("date = " + date);
        }
    }
}
