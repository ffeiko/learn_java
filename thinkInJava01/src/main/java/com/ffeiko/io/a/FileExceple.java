package com.ffeiko.io.a;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/4.
 */
public class FileExceple {

    public static void main(String[] args) {
       FileExceple.createFile();
    }

    public static void createFile() {

        File file = new File("E:\\迅雷下载\\1.txt");

        try {
            //创建文件
            file.createNewFile();
/*
           System.out.println("该分区大小"+file.getTotalSpace()/(1024*1024*1024)+"G");
*/
            file.mkdirs();  //创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
            file.delete(); //  删除此抽象路径名表示的文件或目录
            System.out.println("文件名  " + file.getName());  //  返回由此抽象路径名表示的文件或目录的名称。
            System.out.println("文件父目录字符串 " + file.getParent());// 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
