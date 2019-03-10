package com.note.demo.spring.cloud.stream.demo;

import org.springframework.amqp.core.Message;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * @author yanzy
 * @date 2019/3/8 下午1:31
 * @description
 */
@EnableBinding(value = {MyChannel.class})
public class MyReceiver {

    @StreamListener(MyChannel.INPUT)
    @SendTo(MyChannel.OUTPUT)
    private Object reveive(Object messageObject){
        System.out.println((Message)messageObject);
        return (Message)messageObject;
    }
}
