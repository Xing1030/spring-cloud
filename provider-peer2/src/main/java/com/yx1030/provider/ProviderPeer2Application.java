package com.yx1030.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableEurekaClient
@RestController
//@RefreshScope
public class ProviderPeer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPeer2Application.class, args);
    }
@GetMapping("")
    public Object index(){
        String str = "这个是服务2返回的";
        return new String(str);
}

}
