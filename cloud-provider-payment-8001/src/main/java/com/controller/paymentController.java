package com.controller;

import com.entities.commonResult;
import com.entities.payment;
import com.service.paymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class paymentController {
    @Resource
    private paymentService paymentService;

    @PostMapping(value = "/payment/create")
    public commonResult create(payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果:"+ result);
        if(result > 0) {
            return new commonResult(200,"插入数据成功。",result);
        }else{
            return new commonResult(400,"插入数据失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public commonResult getPaymentById(@PathVariable("id") Long id) {
        payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果：{payment}");
        if (payment != null) {
            return new commonResult(200, "查询成功", payment);
        } else {
            return new commonResult(444, "无记录");
        }
    }
}
