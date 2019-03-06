package com.note.demo.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author yanzy
 * @date 2019/3/6 下午2:44
 * @description
 */
@Configuration
@ComponentScan(basePackages = "com.note.demo.mvc", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
