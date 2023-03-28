package com.itheima.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(value = {Exception.class})
    public void doException(Exception ex) {
        System.out.println("异常" + ex);
    }
}
