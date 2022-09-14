package com.baobao.springcloud.service;


import cloud.baobao.springcloud.entities.Payment;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-08-02 23:45
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
