package com.essoft.spring_design_pattern.dto;

public record PaymentRequest(
        String orderId,
        Double amount,
        String paymentType
) {
}
