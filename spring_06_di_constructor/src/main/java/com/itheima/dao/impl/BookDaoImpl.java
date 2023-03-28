package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectNum;

    private String connectName;

    public BookDaoImpl(int connectNum, String connectName) {
        this.connectNum = connectNum;
        this.connectName = connectName;
    }

    @Override
    public void save() {
        System.out.println("book dao save" + connectNum  + connectName);
    }


}
