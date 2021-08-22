package com.yx1030.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

@RestController
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("index")
    public Object getIndex(){
        // getForObject("亲求地址",参数类型,"参数");
        //return restTemplate.getForObject("http://PROVIDER-PEER/",String.class,"");
        // ribbon使用
        /*ServiceInstance choose = loadBalancerClient.choose("provider-peer");
        String host = choose.getHost();
        int port = choose.getPort();
        return restTemplate.getForObject("http://"+host+":"+port,String.class,"");*/
        return restTemplate.getForObject("http://provider-peer",String.class,"");
    }

}
