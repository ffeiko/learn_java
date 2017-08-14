package com.ffeiko.threadA.Semaphore.SemaphoreManyToOne_02;

/**
 * Created by lenovo on 2017/7/15.
 */
public class run {


    public static void main(String[] args) {
    Service service = new Service();
    MyThread[] threadsArray = new MyThread[12];
        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i] = new MyThread(service);
            threadsArray[i].start();
        }

    }
}
