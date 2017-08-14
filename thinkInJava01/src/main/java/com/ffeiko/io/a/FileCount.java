package com.ffeiko.io.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/4.
 */
public class FileCount {


    public static void main(String[] args) {
        Integer count = 0;
        InputStream inputstreamreader = null;


        try {
            inputstreamreader = new FileInputStream(new File("E:\\迅雷下载\\QQ浏览器截图_20170607161253_4023ECEECCA64249A875DD21421A00E4.jpg"));

            while (inputstreamreader.read() != -1) {
                count++;
            }
            System.out.println("---长度是:" + count + "字节");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputstreamreader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
