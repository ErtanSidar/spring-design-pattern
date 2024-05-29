package com.essoft.spring_design_pattern.strategy;

public interface PaymentStrategy {
    String pay(String orderId, Double amount, String paymentType);
}
