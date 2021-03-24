package com.spdb.club.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebConfig 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/3/20 18:03
 * @Version 1.0
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    //这个方法主要使用来配置静态资源，比如html，js，css
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){}

    //这个主要是用来注册拦截器，写好自己的拦截器需要通过这了添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(loginInterceptor).addPathPatterns("/login").excludePathPatterns("/club/login");
    }
}
