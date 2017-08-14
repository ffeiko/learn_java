package com.ffeiko.Timmer;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/8/5.
 */
public class TimeTest {
    public static void main(String[] args) {
        TimeTest test = new TimeTest();
//        test.test1();
//        test.test2();
//        test.test3();
        test.test4();
    }

    public void test1() {
        // 第一种方法：指定任务task在指定时间time执行
        //schedule(TimerTask task, Date time)
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,12); //控制时
        calendar.set(Calendar.MINUTE,15); //控制分
        calendar.set(calendar.SECOND,0);
        Date time = calendar.getTime();
        Timer timer =  new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date().getTime() + "=======定时任务======");
            }
        },time);
    }

    public void test2() {
       // 指定任务task在指定延迟delay后执行 ,只执行一次
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println(new Date().getTime()+"-------定时任务2--------");
            }
        }, 2000);// 指定延迟2000毫秒后执行
    }

    public void test3() {
        //第三种方法：指定任务task在指定时间firstTime执行后，进行重复固定延迟频率peroid的执行
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, 00); // 控制时
            calendar.set(Calendar.MINUTE, 00);    // 控制分
            calendar.set(Calendar.SECOND, 0);    // 控制秒
            Date time = calendar.getTime();     // 得出执行任务的时间,此处为今天的00：00：00
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    System.out.println(new Date().getTime()+"-------定时任务3--------");
                }
            }, time, 1000 * 6 );
    }
    // 第四种方法：指定任务task 在指定延迟delay 后，进行重复固定延迟频率peroid的执行
    public void test4() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println(new Date().getTime()+"-------定时任务4--------");
            }
        }, 1000, 5000);

    }
    // 第五种方法：指定任务task在指定时间firstTime执行后，进行重复固定延迟频率peroid的执行
    public void test5() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 00); // 控制时
        calendar.set(Calendar.MINUTE, 00);    // 控制分
        calendar.set(Calendar.SECOND, 0);    // 控制秒
        Date time = calendar.getTime();     // 得出执行任务的时间,此处为今天的00：00：00

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(new Date().getTime()+"-------定时任务5--------");
            }
        }, time, 1000 * 60 * 60 * 24);

    }
    // 第六种方法：指定任务task 在指定延迟delay 后，进行重复固定延迟频率peroid的执行
    public void test6() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(new Date().getTime()+"-------定时任务6--------");
            }
        }, 1000, 2000);

    }

    public void test7() {
    }

}
