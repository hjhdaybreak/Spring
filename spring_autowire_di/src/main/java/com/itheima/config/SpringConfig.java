package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.itheima.dao", "com.itheima.service"})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {


}
