package com.ffeiko.io.a;

import java.io.*;

/**
 * Created by Administrator on 2017/7/4.
 */
public class ObjetStream {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       //自动生成的方法存根

        ObjectOutputStream objectoutputstream = null;
   ObjectInputStream objectInputStream = null;

        try {
//            这个地方因为空格原因导致出错
            objectoutputstream = new ObjectOutputStream(new FileOutputStream("E:\\迅雷下载\\1.txt"));
            objectoutputstream.writeObject(new Student("wangjingfei",2));
            objectoutputstream.writeObject(new Student("wangjingfei",2));
            objectoutputstream.writeObject(new Student("wangjingfei",2));
            objectoutputstream.writeObject(new Student("wangjingfei",2));
            objectInputStream=new ObjectInputStream(new FileInputStream("E:\\迅雷下载\\1.txt"));

            for (int i = 0; i < 3; i++) {
            System.out.println(objectInputStream.readObject());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectoutputstream.close();
                objectoutputstream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
