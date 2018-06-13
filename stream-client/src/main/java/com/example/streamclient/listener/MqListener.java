package com.example.streamclient.listener;

import com.example.streamclient.receiver.SinkReceiver;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author MistLight
 * @create 2018-05-07 18:56
 * @desc MQ监听类
 */
@EnableBinding(SinkReceiver.class)
public class MqListener {

    @StreamListener(value = SinkReceiver.Test )
    public void receive(String payload){
        System.out.println(payload);
    }

}
