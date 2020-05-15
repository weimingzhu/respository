package com.example.springbootdemoconsumer.controller;

import com.example.springbootdemoconsumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProductService productService;

    @RequestMapping("getConsumer")
    public String getConsumer(){
        return productService.getProduct();
    }

}
