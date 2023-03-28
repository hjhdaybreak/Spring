package com.itheima.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public void getById(@PathVariable Integer id) {
        System.out.println("111111");
    }


}

