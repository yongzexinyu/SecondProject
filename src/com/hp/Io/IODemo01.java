package com.hp.Io;

import java.io.File;
import java.io.IOException;

public class IODemo01 {
    public static void main(String[] args) {
        //isHidden()是否为隐藏文件
        File  file=new File("./");//文件路径
        //一定要有这个代码否则文件会被覆盖
        while(true){
        boolean exists = file.exists();//判断文件是否存在
       // file.lastModified()//最后修改时间
        if(exists) {
            System.out.println("文件已存在");
            boolean file1 = file.isFile();

            if (file1) {
                file.delete();
                System.out.println("文件已删除");
            }

        }else{
            try {
                boolean newFile = file.createNewFile();
            if(newFile){
                System.out.println("文件创建成功");
                String name = file.getName();
                System.out.println("文件名为 = " + name);
                long length = file.length();
                System.out.println("文件长度 = " + length);
            }else{
                System.out.println("文件创建失败");
            }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }}
}
