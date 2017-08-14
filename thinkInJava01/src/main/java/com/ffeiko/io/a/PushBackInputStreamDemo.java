package com.ffeiko.io.a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * 回退流操作
 * <p>
 * Created by Administrator on 2017/7/5.
 */
public class PushBackInputStreamDemo {
    public static void main(String[] args) {
        String str = "hello,wangjingfei";
        PushbackInputStream push = null;
        ByteArrayInputStream bat = null;

        bat = new ByteArrayInputStream(str.getBytes());//创建字节输出流
        push = new PushbackInputStream(bat);//创建回退流对象,将拆解的字节数组流传入
        int temp = 0;
        try {
            while ((temp = push.read()) != -1) { //push.read()逐字节读取存放在temp中,如果读取完成返回-1
                if (temp == ',') {
                    push.unread(temp);//回到temp的位置
                    temp = push.read();
                    System.out.print("(回退" + (char) temp + ") "); // 输出回退的字符
                } else {
                    System.out.print((char) temp); // 否则输出字符
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
