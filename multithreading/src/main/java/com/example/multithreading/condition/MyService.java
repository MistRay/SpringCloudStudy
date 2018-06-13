package com.example.multithreading.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author MistLight
 * @create 2018-05-02 17:37
 * @desc
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private  boolean hasValue = false;
    public void set(){
        try {
            lock.lock();
            if (hasValue == true){
                condition.await();
            }
            System.out.println("打印111");
            hasValue = true;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public  void  get(){
        try {
            lock.lock();
            if (hasValue == false){
                condition.await();
            }
            System.out.println("打印222");
            hasValue = false;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


}
