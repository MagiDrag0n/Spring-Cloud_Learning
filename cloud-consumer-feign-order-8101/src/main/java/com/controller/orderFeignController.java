package com.controller;

import com.entities.commonResult;
import com.entities.payment;
import com.service.paymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class orderFeignController {
    @Resource
    private com.service.paymentFeignService paymentFeignService;

    @GetMapping(value = "/payment/get/{id}")
    public commonResult<payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

}
