package com.example.springbootdemoconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-server", path = "/product")
public interface ProductService {

    @RequestMapping(value = "getProduct")
    String getProduct();

}
