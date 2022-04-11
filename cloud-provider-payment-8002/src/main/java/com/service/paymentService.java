package com.service;

import com.entities.payment;
import org.apache.ibatis.annotations.Param;

public interface paymentService {
    public int create(payment payment);

    public payment getPaymentById(@Param("id") Long id);
}
