package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class BookDaoImpl implements BookDao {


    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @PostConstruct
    public void init() {

    }

    @PreDestroy
    public void destroy() {

    }
}
