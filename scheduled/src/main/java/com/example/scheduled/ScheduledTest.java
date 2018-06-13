package com.example.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author MistLight
 * @create 2018-04-27 19:23
 * @desc
 */
@Component
public class ScheduledTest {

    /**
     * 测试定时任务
     */
    @Scheduled(fixedRate = 1500)
    public void doSomething(){
        System.out.println(System.currentTimeMillis());
    }
}
