package com.example.multithreading.condition;

/**
 * @author MistLight
 * @create 2018-05-02 17:46
 * @desc
 */
public class MyThreadA extends  Thread{
    private MyService myService;

    public MyThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run(){
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.set();
        }
    }
}
