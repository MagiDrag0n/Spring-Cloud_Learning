package com;

import cn.hutool.db.sql.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
//@EnableCircuitBreaker
public class OrderHystrixMain8101 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain8101.class, args);
    }
}
