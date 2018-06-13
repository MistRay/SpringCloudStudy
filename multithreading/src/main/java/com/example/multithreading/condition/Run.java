package com.example.multithreading.condition;

/**
 * @author MistLight
 * @create 2018-05-02 17:49
 * @desc
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA myThreadA = new MyThreadA(myService);
        myThreadA.start();
        MyThreadB myThreadB = new MyThreadB(myService);
        myThreadB.start();
    }
}
