package com.ffeiko.test;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/12.
 */
public class testCaldener
{
    //获取当前时间的 年月日分秒钟等
    private String getConnByTime(long time) {
        String conn = "";
        Calendar ca = Calendar.getInstance();
        Date date = new Date(time);
        ca.setTime(date);
        conn = ca.get(Calendar.SECOND) + " " + ca.get(Calendar.MINUTE) + " " + ca.get(Calendar.HOUR_OF_DAY) + " "
                + ca.get(Calendar.DAY_OF_MONTH) + " " + (ca.get(Calendar.MONTH) + 1) + " ? " + ca.get(Calendar.YEAR);

        System.out.println(conn);

        return conn;
    }

    public static void main(String[] args) {
        testCaldener testCaldener = new  testCaldener();
        testCaldener.getConnByTime(System.currentTimeMillis());
    }


}
