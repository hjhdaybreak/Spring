package com.itheima.service.impl;


import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    //1. 先根据类型注入
    //2. 多个类型相同的 根据 bean 名称注入
//    @Qualifier("xxx") //bean 指定名字
    private BookDao bookDao;


    @Override
    public void save() {
        System.out.println("book service ..");
        bookDao.save();
    }
}
