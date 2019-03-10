package com.note.demo.spring.cloud.stream.test;

import com.note.demo.DemoApplication;
import com.note.demo.spring.cloud.stream.demo.MyChannel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author yanzy
 * @date 2019/3/8 下午1:44
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@WebAppConfiguration
public class StreamTest {

    @Autowired
    private MyChannel myChannel;

    @Autowired
    private MessageChannel output;

    @Test
    public void interfaceSend(){
        myChannel.output().send(MessageBuilder.withPayload("From MyChannel").build());
    }

    @Test
    public void channelSend(){
        output.send(MessageBuilder.withPayload("From MyChannel").build());
    }
}
