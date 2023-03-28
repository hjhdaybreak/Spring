package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.BookService;


public class BookServiceImpl implements BookService {

    private BookDao bookDao;


    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }


}
