package com.itheima;


import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookDao =  ctx.getBean(BookService.class);
        bookDao.save();
    }
}
