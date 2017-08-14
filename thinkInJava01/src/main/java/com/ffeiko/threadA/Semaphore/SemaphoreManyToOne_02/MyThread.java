package com.ffeiko.threadA.Semaphore.SemaphoreManyToOne_02;

/**
 * Created by lenovo on 2017/7/15.
 */
public class MyThread  extends Thread{

private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.sayHello();
    }
}
