package com.itheima.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
//@ComponentScan({"com.itheima.config"}) 和  JdbcConfig 的 @Configuration 注解是配对的  推荐使用 Import
@Import({JdbcConfig.class})
public class SpringConfig {


}
