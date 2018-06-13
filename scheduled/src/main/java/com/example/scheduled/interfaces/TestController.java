package com.example.scheduled.interfaces;

import com.example.scheduled.ScheduledTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MistLight
 * @create 2018-04-27 19:32
 * @desc
 */
@RestController
public class TestController {

    @Autowired
    ScheduledTest scheduledTest;

    @RequestMapping("/test")
    public void TestScheduled(){
        scheduledTest.doSomething();
    }
}
