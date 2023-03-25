package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bookDao")
//@Scope("singleton")
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
