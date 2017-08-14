package com.ffeiko.enums;

/**
 * Created by Administrator on 2017/7/6.
 */
public class test2 {


    public static void main(String[] args) {
        enum1 test = enum1.TUE;

        //compareTo(E o)
        switch (test.compareTo(enum1.MON)) {
            case -1:
                System.out.println("TUE 在 MON 之前");
                break;
            case 1:
                System.out.println("TUE 在 MON 之后");
                break;
            default:
                System.out.println("TUE 与 MON 在同一位置");
                break;
        }

        //getDeclaringClass()
        System.out.println("getDeclaringClass(): " + test.getDeclaringClass().getName());

        //name() 和  toString()
        System.out.println("name(): " + test.name());
        System.out.println("toString(): " + test.toString());

        //ordinal()， 返回值是从 0 开始
        System.out.println("ordinal(): " + test.ordinal());
    }
}
