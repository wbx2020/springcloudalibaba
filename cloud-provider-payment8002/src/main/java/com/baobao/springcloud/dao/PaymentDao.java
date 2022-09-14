package com.baobao.springcloud.dao;

import cloud.baobao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-08-02 23:31
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
