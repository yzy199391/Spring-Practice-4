package com.note.demo.aop.impl;

import com.note.demo.aop.interf.Encoreable;

/**
 * @author yanzy
 * @date 2019/3/4 下午6:38
 * @description
 */
public class DefaultEncoreable implements Encoreable {
    @Override
    public void encoreable() {
        System.out.println("default encoreable implement");
    }
}
