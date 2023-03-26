package com.itheima;



import com.itheima.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        Iterator<String> beanNamesIterator = ctx.getBeanFactory().getBeanNamesIterator();

        System.out.println(dataSource);
        while (beanNamesIterator.hasNext()){
            System.out.println(beanNamesIterator.next());
        }
    }
}
