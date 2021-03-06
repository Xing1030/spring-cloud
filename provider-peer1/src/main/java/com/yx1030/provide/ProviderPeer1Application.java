package com.yx1030.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//
@EnableEurekaClient
@RestController
public class ProviderPeer1Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPeer1Application.class, args);
    }
@GetMapping("")
    public Object index(){
        String str = "这是服务端1返回的应答";
        return new String(str);
}
}
