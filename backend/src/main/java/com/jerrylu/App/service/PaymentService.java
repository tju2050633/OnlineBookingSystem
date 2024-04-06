package com.jerrylu.App.service;

import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Autowired
    private PaymentMethodMapper paymentMethodMapper;

    // payment

    public List<Payment> getAllPayments() {
        System.out.println("Service Getting all payments");
        return paymentMapper.getAllPayments();
    }

    public Payment getPaymentById(int id) {
        System.out.println("Service Getting payment by id: " + id);
        return paymentMapper.selectById(id);
    }

    public List<Payment> getPaymentByUserId(int id) {
        System.out.println("Service Getting payment by user id: " + id);
        return paymentMapper.selectByUserId(id);
    }

    public Payment addPayment(Payment payment) {
        System.out.println("Service Adding payment: " + payment.toString());
        paymentMapper.insert(payment);
        return payment;
    }

    public Payment updatePayment(Payment payment) {
        System.out.println("Service Updating payment: " + payment.toString());
        paymentMapper.updateById(payment);
        return payment;
    }

    public void deletePayment(int id) {
        System.out.println("Service Deleting payment: " + id);
        paymentMapper.deleteById(id);
    }

    // payment method

    public List<PaymentMethod> getAllPaymentMethods() {
        System.out.println("Service Getting all payment methods");
        return paymentMethodMapper.getAllPaymentMethods();
    }

}