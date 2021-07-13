package com.hp.day06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {

      //a-z 65-90  A-Z 97-122
        Random r=new Random();
        ArrayList<Character> list=new ArrayList<>();
        for (int i = 65; i <91 ; i++) {
            Character ii=(char)i;
            list.add(ii);
        }
        for (int j=97; j<122;j++){
            Character jj=(char)j;
            list.add(jj);
        }
       String ch= "";
        for (int i = 0; i < 5; i++) {
           int n= r.nextInt(list.size());
            Character character = list.get(n);
             ch+=character;

        }
        System.out.println(ch);
       checkInput(ch);
    }
       public static boolean checkInput(String ch ){
           Scanner sa=new Scanner(System.in);
           System.out.println("请输入验证码");
           String aa=sa.nextLine();
           if(aa.equalsIgnoreCase(ch)){
               System.out.println("输入正确");
                return true;
           }else{
               System.out.println("验证码错误");
               return  false;

           }
       }


}
