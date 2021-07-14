package com.hp.day06;


import java.util.HashMap;

public class Test08 {

    public static void main(String[] args) {
      //  String line = "{ \"username\":\"tangseng\", \"age\":\"500\"  } ";
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("username","tangseng");
        map.put("age","500");
        QunJingRen a=new QunJingRen();
        a.setUsername(map.get("username"));
        a.setAge(map.get("age"));
        System.out.println(a.getUsername());
        System.out.println(a.getAge());

    }
}

 class QunJingRen{
    private String username;
    private String age;

     public String getUsername() {
         return username;
     }

     public void setUsername(String username) {
         this.username = username;
     }

     public String getAge() {
         return age;
     }

     public void setAge(String age) {
         this.age = age;
     }
 }
