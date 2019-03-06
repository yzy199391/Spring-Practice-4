package com.note.demo.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author yanzy
 * @date 2019/3/5 上午11:36
 * @description
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //指定配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    //配置DispatcherServlet映射到Controller规则，此处映射到"/"
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
