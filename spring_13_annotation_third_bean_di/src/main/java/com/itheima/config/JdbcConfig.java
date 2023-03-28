package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {

    @Value("com.mysql.jdbc.Driver")
    String driverName;

    @Value("jdbc:mysql://localhost:3306/bilibili")
    String url;

    @Value("root")
    String userName;

    @Value("root")
    String passWord;

    @Bean
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driverName);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(passWord);
        return ds;
    }
}
