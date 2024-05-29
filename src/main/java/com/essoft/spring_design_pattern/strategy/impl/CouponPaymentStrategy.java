package com.essoft.spring_design_pattern.strategy.impl;

import com.essoft.spring_design_pattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("coupon")
public class CouponPaymentStrategy implements PaymentStrategy {

    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done with Wire Transfer Strategy: " + orderId + " Amount: " + amount + " Payment Type: " + paymentType;
    }
}
