package com.essoft.spring_design_pattern.controller;

import com.essoft.spring_design_pattern.dto.PaymentRequest;
import com.essoft.spring_design_pattern.enumfactory.PaymentEnumType;
import com.essoft.spring_design_pattern.factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/payment")
public class PaymentEnumController {

    private final PaymentFactory paymentFactory;

    public PaymentEnumController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok(
                PaymentEnumType.getPaymentType(paymentRequest.paymentType())
                        .getPayment().pay(paymentRequest.orderId(), paymentRequest.amount()));
    }
}
