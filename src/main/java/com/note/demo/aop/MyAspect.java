package com.note.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/**
 * @author yanzy
 * @date 2019/2/28 上午9:12
 * @description
 */
@Aspect
//@Component
public class MyAspect {
    private Map<Integer, Integer> counterMap = new HashMap<>();

    @Pointcut("@annotation(com.note.demo.aop.AopLog)")
    //@Pointcut("execution(* com.note.demo.aop.interf.Performance.perform(..))")
    public void logPointCut(){}

    @Pointcut("execution(* com.note.demo.aop.interf.Performance.countPrograms(Integer))" + " && args(id)")
    public void countPointCut(Integer id){}

    //@Around("logPointCut()")
    //@Before("execution(* com.note.demo.aop.interf.Performance.perform(..))")
    //@Before("@annotation(com.note.demo.aop.AopLog)")
    public void around(ProceedingJoinPoint point) throws Throwable{
        System.out.println("环绕织入-前");
        point.proceed();
        System.out.println("环绕织入-后");
    }

    @Before("logPointCut()")
    public void before(){
        System.out.println("织入前处理");
    }

    /*@Before("countPointCut(count)")
    public void beforeWithParam(Integer count){
        System.out.println("带参数-织入前处理" + "切面处理参数为 " + count);
    }

    @After("countPointCut(count)")
    public void afterWithParam(Integer count){
        System.out.println("带参数-织入后处理" + "切面处理后参数为 " + count);
    }*/

    @Around("countPointCut(id)")
    public void counter(ProceedingJoinPoint point, Integer id) throws Throwable {
        int currentCount = getProgramCount(id);
        counterMap.put(id, currentCount + 1);
    }

    private int getProgramCount(int id){
        if(counterMap.containsKey(id)){
            return counterMap.get(id);
        }else{
            return 0;
        }
    }



}
