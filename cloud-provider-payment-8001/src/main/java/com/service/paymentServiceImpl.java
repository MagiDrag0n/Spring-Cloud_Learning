package com.service;

import com.dao.paymentDAO;
import com.entities.payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class paymentServiceImpl implements paymentService{
    @Resource
    private paymentDAO paymentDAO;

    @Override
    public int create(payment payment) {
        return paymentDAO.create(payment);
    }

    @Override
    public payment getPaymentById(Long id) {
        return paymentDAO.getPaymentById(id);
    }
}
