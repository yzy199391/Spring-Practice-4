package com.note.demo.aop.config;

import com.note.demo.aop.MyAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author yanzy
 * @date 2019/3/1 下午5:15
 * @description
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {
    @Bean
    public MyAspect myAspect(){
        return new MyAspect();
    }
}
