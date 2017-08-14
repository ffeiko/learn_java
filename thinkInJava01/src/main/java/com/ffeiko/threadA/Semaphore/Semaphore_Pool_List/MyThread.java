package com.ffeiko.threadA.Semaphore.Semaphore_Pool_List;

import com.ffeiko.threadA.Semaphore.SemaphoreManyToOne_01.Service;

/**
 * Created by lenovo on 2017/7/15.
 */
public class MyThread extends Thread{
    private ListPool listPool;

    public MyThread(ListPool listPool) {
        this.listPool = listPool;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
             String getString = listPool.get();
            System.out.println(Thread.currentThread().getName() +"取得值"+getString);
            listPool.put(getString);
        }
    }
}
