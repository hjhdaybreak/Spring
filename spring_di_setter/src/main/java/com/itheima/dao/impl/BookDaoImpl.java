package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectNum;

    private String connectName;

    public void setConnectNum(int connectNum) {
        this.connectNum = connectNum;
    }

    public void setConnectName(String connectName) {
        this.connectName = connectName;
    }

    @Override
    public void save() {
        System.out.println("book dao save" + connectNum + connectName);
    }


}
