package com.example.springbootdemoproduct.controller;

import com.example.springbootdemoentity.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("getProduct")
    public String getProduct(){

        Product p = new Product();

        return p.toString();
    }
}
