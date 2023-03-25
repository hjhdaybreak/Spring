package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectNum;

    private String connectName;

    @Override
    public void save() {
        System.out.println("book dao save");
    }

    public void init() {
        System.out.println("book dao  init");
    }

    public void destroy() {
        System.out.println("book dao  destroy");
    }
}
