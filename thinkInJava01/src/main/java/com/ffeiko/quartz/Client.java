package com.ffeiko.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Client {

    public static void main(String[] args) throws SchedulerException {
//        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).build();
//        //10秒钟调用一下HelloJob，永远重复下去
//        Trigger trigger = TriggerBuilder.newTrigger().startNow()
//                .withIdentity("hello")
//                .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(10))
//                .build();
//        scheduler.scheduleJob(jobDetail, trigger);
//        scheduler.start();
        // scheduler.shutdown(true);
    }
}
