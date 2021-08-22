package com.yx1030.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

@RestController
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("index")
    public Object getIndex(){
        // getForObject("亲求地址",参数类型,"参数");
        return restTemplate.getForObject("http://PROVIDER-PEER/",String.class,"");
    }

}
