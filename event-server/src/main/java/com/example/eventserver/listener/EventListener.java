package com.example.eventserver.listener;

import com.example.eventserver.domain.User;
import com.example.eventserver.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author MistLight
 * @create 2018-04-25 19:51
 * @desc
 */
@Component
public class EventListener implements ApplicationListener<MyEvent>{

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        User user = (User) myEvent.getSource();
        System.out.println(user);
    }
}
