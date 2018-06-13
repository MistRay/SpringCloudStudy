package com.example.multithreading.condition;

/**
 * @author MistLight
 * @create 2018-05-02 17:49
 * @desc
 */
public class MyThreadB extends  Thread{
    private MyService myService;

    public MyThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run(){
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.get();
        }
    }
}