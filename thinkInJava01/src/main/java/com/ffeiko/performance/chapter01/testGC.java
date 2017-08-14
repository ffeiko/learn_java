package com.ffeiko.performance.chapter01;

/**
 * Created by lenovo on 2017/7/9.
 */
public class testGC {
    public  static  void  test1(){
        byte[] a = new byte[6*1024*1024];
        System.gc();
        System.out.println("first explict gc over");
    }

    public static void main(String[] args) {
        testGC.test1();
    }

}
