package com.itheima;


import com.itheima.dao.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookDao = (BookService) ctx.getBean("bookService");
        bookDao.save();
    }
}
