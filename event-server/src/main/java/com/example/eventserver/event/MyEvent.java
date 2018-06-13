package com.example.eventserver.event;

import com.example.eventserver.domain.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author MistLight
 * @create 2018-04-25 19:45
 * @desc 测试事件
 */
public class MyEvent extends ApplicationEvent{
    /**
     * 创建一个自定义事件
     * @param source
     */
    public MyEvent(User source) {
        super(source);
    }
}
