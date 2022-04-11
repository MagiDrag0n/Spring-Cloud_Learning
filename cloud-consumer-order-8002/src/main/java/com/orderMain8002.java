package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class orderMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(orderMain8002.class,args);
    }
}
