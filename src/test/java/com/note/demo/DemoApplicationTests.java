package com.note.demo;

import com.note.demo.aop.interf.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    Performance performanceImpl;

    @Test
    public void contextLoads() {
    }

    @Test
    public void perform() {
        performanceImpl.perform();
    }

    @Test
    public void count(){
        performanceImpl.count(111111);
    }

}
