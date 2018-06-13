package com.example.eventserver.interfaces;

import com.example.eventserver.domain.User;
import com.example.eventserver.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MistLight
 * @create 2018-04-25 19:49
 * @desc
 */
@RestController
public class EventController {

    @Autowired
    ApplicationContext applicationcontext;

    @RequestMapping("/test")
    public void TestEvent(){
        User user = new User("老王", 24);
        applicationcontext.publishEvent(new MyEvent(user));
    }
}
