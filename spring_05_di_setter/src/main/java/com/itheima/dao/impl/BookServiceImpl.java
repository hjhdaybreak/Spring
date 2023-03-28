package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

    // 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        System.out.println("set");
        this.bookDao = bookDao;
    }

}
