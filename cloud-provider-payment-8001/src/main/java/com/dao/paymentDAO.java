package com.dao;

import com.entities.payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface paymentDAO {
    public int create(payment payment);

    public payment getPaymentById(@Param("id") Long id);
}
