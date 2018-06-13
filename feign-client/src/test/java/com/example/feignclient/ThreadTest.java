package com.example.feignclient;

import org.junit.Test;

/**
 * @author MistLight
 * @create 2018-04-20 16:43
 * @desc 多线程
 */
public class ThreadTest {

    @Test
    public void TestLambdaThread() {
        new Thread(() -> System.out.println("666")).start();
    }
}
