package com.ffeiko.io.a;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/7/5.
 */
public class SequenceInputStreamTest {
    public static void main(String[] args) {
        doSequence();
    }

    private static void doSequence() {

        // 创建一个合并流的对象
        SequenceInputStream sis = null;
        // 创建输出流。
        BufferedOutputStream bos = null;
        //构建流集合
        try {
            Vector<InputStream> vector = new Vector<InputStream>();
            vector.addElement(new FileInputStream("E:\\迅雷下载\\1.txt"));
            vector.addElement(new FileInputStream("E:\\迅雷下载\\2.txt"));
            vector.addElement(new FileInputStream("E:\\迅雷下载\\3.txt"));

            Enumeration<InputStream> e = vector.elements();

            sis = new SequenceInputStream(e);

            bos = new BufferedOutputStream(new FileOutputStream("D:text4.txt"));

            //读写数据
            byte[] buf = new byte[1024];
            int len = 0;
            try {
                while ((len = sis.read(buf)) != -1) {
                    bos.write(buf, 0, len);
                    bos.flush(); //字符流必须刷新
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
