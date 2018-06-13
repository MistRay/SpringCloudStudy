package com.example.streamserver.interfaces;

import com.example.streamserver.sender.SinkSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MistLight
 * @create 2018-05-07 18:47
 * @desc
 */
@RestController
@EnableBinding(SinkSender.class)
public class TestController {

    @Autowired
    private SinkSender sinkSender;

    @RequestMapping("test")
    public void testMethod(){
        // 发送一条消息
        sinkSender.output().send(MessageBuilder.withPayload("123456123").build());
    }

}
