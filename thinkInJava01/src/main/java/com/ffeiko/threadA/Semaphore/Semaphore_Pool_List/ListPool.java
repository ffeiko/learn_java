package com.ffeiko.threadA.Semaphore.Semaphore_Pool_List;

import javax.print.DocFlavor;
import javax.print.attribute.standard.RequestingUserName;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lenovo on 2017/7/
 */
public class ListPool {
    private int poolMaxSize = 3;
    private  int sermaphorePermits = 5;
    private List<String> list = new ArrayList<String>();
    private Semaphore concurrencySemaphore = new Semaphore(sermaphorePermits);
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public ListPool(){
        super();
        for (int i = 0; i < poolMaxSize; i++) {
            list.add("wangjingfei"+(i+1));
        }
    }

    public String get(){
        String getString = null;
        try {
            concurrencySemaphore.acquire();
            lock.lock();
            while (list.size() == 0){
                condition.await();
            }
            getString = list.remove(0);
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getString;
    }

    public void put(String stringValue){
        lock.lock();
        list.add(stringValue);
        condition.signalAll();
        lock.unlock();
        concurrencySemaphore.release();
    }
}
