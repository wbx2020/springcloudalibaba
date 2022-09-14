package com.baobao.springcloud.service.impl;

import cloud.baobao.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import com.baobao.springcloud.dao.PaymentDao;
import com.baobao.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-08-02 23:47
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
