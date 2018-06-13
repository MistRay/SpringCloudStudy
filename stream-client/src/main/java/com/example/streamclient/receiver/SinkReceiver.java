package com.example.streamclient.receiver;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SinkReceiver {

    String Test = "Test";

    @Input(Test)
    SubscribableChannel restMethod();
}
