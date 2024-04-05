package com.itheima.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//AbstractAnnotationConfigDispatcherServletInitializer 是 Spring Framework 中的一个抽象类，用于配置和初始化基于注解的 DispatcherServlet，这是一个关键的组件用于处理Web请求和响应的分派。
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMcvConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
