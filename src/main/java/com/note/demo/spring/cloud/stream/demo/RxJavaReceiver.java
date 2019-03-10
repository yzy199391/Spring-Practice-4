package com.note.demo.spring.cloud.stream.demo;

import org.springframework.cloud.stream.annotation.rxjava.EnableRxJavaProcessor;
import org.springframework.cloud.stream.annotation.rxjava.RxJavaProcessor;
import org.springframework.context.annotation.Bean;

/**
 * @author yanzy
 * @date 2019/3/8 下午3:09
 * @description
 */
@EnableRxJavaProcessor()
public class RxJavaReceiver {
    @Bean
    public RxJavaProcessor<String, String> processor(){
        return inputStream -> inputStream.map(data -> {
            return data;
        }).map(data -> String.valueOf("From Input Channel Return - " + data));
    }

    @Bean
    public RxJavaProcessor<String, String> cacheProcessor(){
        return inputStream -> inputStream.map(data -> {
            return data;
        }).buffer(5).map(data -> String.valueOf("From Input Channel Return - " + data));
    }
}
