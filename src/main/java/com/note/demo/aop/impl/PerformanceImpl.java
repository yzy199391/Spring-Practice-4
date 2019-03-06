package com.note.demo.aop.impl;

import com.note.demo.aop.AopLog;
import com.note.demo.aop.interf.Performance;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author yanzy
 * @date 2019/3/1 下午3:27
 * @description
 */
//@Component
@Data
public class PerformanceImpl implements Performance {
    @Override
    @AopLog
    public String perform() {
        System.out.println("连接点1");
        return "连接点1";
    }

    @Override
    public void countPrograms(int programId){
        System.out.println("Please enjoy program: " + programId);
    }
}
