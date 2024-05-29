package com.essoft.spring_design_pattern.strategy.impl;

import com.essoft.spring_design_pattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done with CreditCard : " + orderId + " Amount : " + amount + " Payment Type : " + paymentType;
    }
}
