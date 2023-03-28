package com.itheima.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.itheima.controller", "com.itheima.config"})
@EnableWebMvc

//public class SpringMvcConfig implements WebMvcConfigurer {
//@Autowired
//private ProjectInterceptor projectInterceptor;
//
//@Override
//protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
//        }
//@Override
//protected void addInterceptors(InterceptorRegistry registry) {
//        //配置拦截器
//        registry.addInterceptor(projectInterceptor).addPathPatterns("/books", "/books/*");
//        }
//}
public class SpringMvcConfig {

}
