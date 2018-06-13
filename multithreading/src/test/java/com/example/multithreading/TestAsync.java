package com.example.multithreading;

import com.example.multithreading.async.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author MistLight
 * @create 2018-04-27 19:52
 * @desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestAsync {

    @Autowired
    Task task;

    @Test
    public void  AsyncMethod() throws InterruptedException {
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();

        Thread.currentThread().join();
    }


}
