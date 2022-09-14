package com.baobao.springcloud.contorller;

import cloud.baobao.springcloud.entities.CommonResult;
import cloud.baobao.springcloud.entities.Payment;
import com.baobao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-08-02 23:52
 */
@RestController
@RequestMapping("/api/v1/payment")
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @GetMapping("/lb")
    public String lb() {
        return "lb方法8002";
    }

    @GetMapping("/get")
    public String get() {
        return "get方法8002";
    }

    @GetMapping("/get_something/{id}")
    public CommonResult<String> getSomeThing(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult(200,"成功8002", payment);
    }

    @PostMapping("/create")
    public CommonResult<String> create(@RequestParam String serial) {
        Payment payment = new Payment();
        payment.setSerial(serial);
        int i = paymentService.create(payment);
        if (i > 0) {
            return new CommonResult(200, "新增成功8002");
        } else {
            return new CommonResult(444, "新增失败");
        }

    }
}
