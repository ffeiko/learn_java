package com.ffeiko.enums;

/**
 * Created by Administrator on 2017/7/6.
 */
public class test1 {

    public static void main(String[] args) {
        for (enum1 arg : enum1.values()) {

            System.out.println(arg);

        }
        System.out.println("---------------------------------------------------------");
        enum1 test = enum1.TUE;
        switch (test) {
            case THU:
                System.out.println("今天是星期一");
                break;
            case TUE:
                System.out.println("今天是星期二");
                break;
            // ... ...
            default:
                System.out.println(test);
                break;
        }

    }

}