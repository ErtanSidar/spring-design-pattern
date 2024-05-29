package com.essoft.spring_design_pattern.enumfactory;

import com.essoft.spring_design_pattern.enumfactory.payment.Payment;
import com.essoft.spring_design_pattern.enumfactory.payment.impl.CreditCardPayment;
import com.essoft.spring_design_pattern.enumfactory.payment.impl.WireTransferPayment;

public enum PaymentEnumType {
    CREDIT_CARD("creditCard", new CreditCardPayment()) {
        @Override
        public void output() {
            System.out.println("Payment Type : Credit Card");
        }
    },
    WIRE_TRANSFER("wireTransfer", new WireTransferPayment()) {
        @Override
        public void output() {
            System.out.println("Payment Type : Wire Transfer");
        }
    },;

    private final String value;
    private final Payment payment;

    PaymentEnumType(String value, Payment payment) {
        this.value = value;
        this.payment = payment;
    }

    public String getValue() {
        return value;
    }

    public Payment getPayment() {
        return payment;
    }

    public static PaymentEnumType getPaymentType(String value) {
        for (PaymentEnumType paymentEnumType : PaymentEnumType.values()) {
            if (paymentEnumType.getValue().equals(value)) {
                return paymentEnumType;
            }
        }
        throw new IllegalArgumentException("Invalid PaymentEnumType: " + value);
    }

    abstract public void output();
}
