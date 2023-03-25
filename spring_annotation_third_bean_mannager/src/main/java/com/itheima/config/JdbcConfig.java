package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class JdbcConfig {
    //1. 定义一个方法 获得要管理的对象  @Bean 方法返回值作为一个bean 方法名字就是bean名

    @Bean
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/bilibili");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
