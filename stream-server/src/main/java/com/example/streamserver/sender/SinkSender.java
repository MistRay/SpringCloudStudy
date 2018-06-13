package com.example.streamserver.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author MistLight
 * @create 2018-04-17 21:14
 * @desc
 */
public interface SinkSender {

    String Test = "Test";
    @Output(Test)
    MessageChannel output();

}
