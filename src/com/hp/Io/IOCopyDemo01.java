package com.hp.Io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOCopyDemo01 {
    public static void main(String[] args) {
        try {
            RandomAccessFile ref=new RandomAccessFile("D://QQ文件//profile/javaapi01.zip","r");
            RandomAccessFile secondName=new RandomAccessFile("D://QQ文件//profile/javaapi01副本.zip","rw");
       int d=-1;//
            while (true){
                try {
                    if((d=ref.read())!=-1){
                        secondName.write(d);//到-1是完毕
                    }
                } catch (IOException e) {
                    System.out.println("文件没有读取到");
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件，或者不可读");
            e.printStackTrace();
        }

    }
}
