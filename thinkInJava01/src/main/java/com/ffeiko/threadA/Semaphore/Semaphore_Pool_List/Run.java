package com.ffeiko.threadA.Semaphore.Semaphore_Pool_List;

/**
 * Created by lenovo on 2017/7/15.
 */
public class Run {


    public static void main(String[] args) {
        ListPool pool = new  ListPool();
        MyThread[] threayArray = new MyThread[12];
        for (int i = 0; i < threayArray.length; i++) {
             threayArray[i] = new MyThread(pool);

        }
        for (int i = 0; i < threayArray.length; i++) {
            threayArray[i].start();
        }

    }

}
