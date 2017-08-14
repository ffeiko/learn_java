package com.ffeiko.performance.chapter03;

/**
 * Created by lenovo on 2017/7/9.
 */
public class Clone {
    private static Clone baseCredit = new Clone();
    public static void main(String[] args) {
        try {
            baseCredit.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
