package com.ffeiko.system;

/**
 * Created by lenovo on 2017/8/6.
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println(System.getenv());

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.vm.specification"));
    }


}
