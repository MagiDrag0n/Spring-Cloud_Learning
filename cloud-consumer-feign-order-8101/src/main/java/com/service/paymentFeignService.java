package com.service;

import com.entities.commonResult;
import com.entities.payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface paymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public commonResult<payment> getPaymentById(@PathVariable("id") Long id);
}
