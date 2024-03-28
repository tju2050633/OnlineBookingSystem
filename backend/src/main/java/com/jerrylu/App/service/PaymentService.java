package com.jerrylu.App.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    private PaymentMethodMapper paymentMethodMapper;

    // payment

    public List<Payment> getAllPayments() {
        return paymentMapper.selectList(new QueryWrapper<>());
    }

    public Payment getPaymentById(int id) {
        return paymentMapper.selectById(id);
    }

    public Payment getPaymentByUserId(int id) {
        QueryWrapper<Payment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserID", id);
        return paymentMapper.selectOne(queryWrapper);
    }

    public Payment addPayment(Payment payment) {
        paymentMapper.insert(payment);
        return payment;
    }

    public Payment updatePayment(Payment payment) {
        paymentMapper.updateById(payment);
        return payment;
    }

    public void deletePayment(int id) {
        paymentMapper.deleteById(id);
    }

    // payment method

    public List<PaymentMethod> getAllPaymentMethods() {
        return paymentMethodMapper.selectList(new QueryWrapper<>());
    }

}
