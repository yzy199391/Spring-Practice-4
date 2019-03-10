package com.note.demo.spring.cloud.stream.demo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author yanzy
 * @date 2019/3/8 下午1:27
 * @description
 */
public interface MyChannel {
    String INPUT = "input";
    String OUTPUT = "output";

    @Input(INPUT)
    SubscribableChannel input();

    @Output(OUTPUT)
    MessageChannel output();
}
