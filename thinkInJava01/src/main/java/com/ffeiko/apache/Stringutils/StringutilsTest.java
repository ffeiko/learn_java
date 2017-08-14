package com.ffeiko.apache.Stringutils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2017/7/27.
 */
public class StringutilsTest {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        boolean empty = StringUtils.isEmpty("laile");
        System.out.println(empty);
    }


    public static String test2(){
        int i = StringUtils.indexOf("1", "2");
        System.out.println(i);
        return  null;
    }




}
