package com.itheima;


import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao1 = ctx.getBean("bookDao", BookDao.class);
        BookDao bookDao2 = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
