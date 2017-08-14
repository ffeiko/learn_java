package com.ffeiko.io.a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/4.
 */
public class FileCopy {
    public static void main(String[] args) {
        //自动生成的方法存根
        byte[] buffer = new byte[512];

        Integer numberRead = 0;

        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("E:\\迅雷下载\\QQ浏览器截图_20170607161253_4023ECEECCA64249A875DD21421A00E4.jpg");
            output = new FileOutputStream("E:\\迅雷下载\\QQ浏览器截图_20170607161253_4023ECEECCA64249A875DD21421E4.jpg");
            while ((numberRead = input.read(buffer)) != -1) {//numberReadde目的在于防止最后一次读取的字节会自动创建
                output.write(buffer, 0, numberRead);//否则会自动被填充0
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
