package com.itheima;

import com.itheima.dao.BookService;
import com.itheima.dao.OrderDao;
import com.itheima.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) application.getBean("bookService");
        bookService.save();

        OrderDao orderDao = (OrderDao) application.getBean("orderDao");
        orderDao.save();

        UserDao userDao = (UserDao) application.getBean("userDao");
        userDao.save();
    }
}
