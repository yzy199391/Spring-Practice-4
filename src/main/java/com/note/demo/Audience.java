package com.note.demo;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yanzy
 * @date 2019/3/4 下午5:39
 * @description
 */
public class Audience {
    private Map<Integer, Integer> counterMap = new HashMap<>();

    public void silenceCellPhone() {
        System.out.println("Silence cell phone");
    }

    public void takeSeats() {
        System.out.println("Taking seats");
    }

    public void applause() {
        System.out.println("CLAP, CLAP, CLAP!!!");
    }

    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    public void watchPerformance(ProceedingJoinPoint point){
        try{
            System.out.println("Silencing cell phone");
            System.out.println("Taking seats");
            point.proceed();
            System.out.println("CLAP, CLAP, CLAP!!!");
        }catch(Throwable e){
            System.out.println("Demanding a refund");
        }
    }

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
