package com.hp.day08;

import java.util.ArrayList;
import java.util.Collections;

public class PuKe {
    private  static  ArrayList<String> player1;
    private  static  ArrayList<String> player2;
    private  static  ArrayList<String> player3;
    private  static  ArrayList<String> di;
    private  static  ArrayList<String> piKe;

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("♠");//黑桃
        color.add("♥");//红桃
        color.add("♦");//方块
        color.add("♣");//梅花
        ArrayList<String> pai = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            pai.add(i + "");
        }
        pai.add("J");
        pai.add("Q");
        pai.add("K");
        pai.add("A");
        piKe = new ArrayList<String>();
        for (String col : color) {
            for (String pa : pai) {
                piKe.add(col + pa);
            }
        }
        piKe.add("🤡");//大王
        piKe.add("🃏");//小王
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
        player3 = new ArrayList<>();
        boolean flag=true;
        while (flag) {
            //如果set也无法打乱排序，换为list使用 collections.shuffle（）方法打乱ArrayList排序
            Collections.shuffle(piKe);
            System.out.println(piKe);
             di = new ArrayList<>();
             shua();
            if(di.contains("♥3")){
                shua();
            }else{
                flag=false;
                if(player1.contains("♥3")){
                    System.out.println("player1 = " + player1);
                    System.out.println("玩家一是地主");
                }else if(player2.contains("♥3")){
                    System.out.println("player2 = " + player2);
                    System.out.println("玩家二是地主");
                }else if(player3.contains("♥3")){
                    System.out.println("player2 = " + player3);
                    System.out.println("玩家三是地主");
                }
            }
        }
    }
    private static void shua(){
        for (int i = 0; i <= 53; i++) {
            if (i > 50) {
                di.add(piKe.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(piKe.get(i));
                } else if (i % 3 == 1) {
                    player2.add(piKe.get(i));
                } else {
                    player3.add(piKe.get(i));
                }
            }
        }
    }
}
