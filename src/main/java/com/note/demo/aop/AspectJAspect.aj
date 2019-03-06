package com.note.demo.aop;

import com.note.demo.aop.interf.Performance;

/**
 * @author yanzy
 * @date 2019/3/5 上午9:52
 * @description
 */
public aspect AspectJAspect {
    private Performance performance;

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    pointcut performance() : execution(* perform(..));
}
