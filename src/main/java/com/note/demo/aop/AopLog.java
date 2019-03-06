package com.note.demo.aop;

import java.lang.annotation.*;

/**
 * @author yanzy
 * @date 2019/2/28 上午9:47
 * @description
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopLog {
}
