package com.note.demo.spring.cloud.stream.demo;

import org.springframework.amqp.core.Message;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author yanzy
 * @date 2019/3/8 下午2:17
 * @description
 */
@EnableBinding(value = {MyChannel.class})
public class OriginSpringIntegrationReceiver {

    @ServiceActivator(inputChannel = MyChannel.INPUT)
    public void receive(Object message){
        System.out.println((Message) message);
    }

    @Transformer(inputChannel = MyChannel.INPUT, outputChannel = MyChannel.OUTPUT)
    public Object transform(Date message){
        return new SimpleDateFormat(("yyyy-mm-dd HH:mm:ss")).format(message);
    }

    @Bean
    @InboundChannelAdapter(value = MyChannel.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Date> timerMessageSource(){
        return () -> new GenericMessage<>(new Date());
    }

}
