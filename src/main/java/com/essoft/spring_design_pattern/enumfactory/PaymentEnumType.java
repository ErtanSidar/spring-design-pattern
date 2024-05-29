package com.essoft.spring_design_pattern.enumfactory;

public enum PaymentEnumType {
    CREDIT_CARD("creditCard"),
    WIRE_TRANSFER("wireTransfer");

    private final String value;

    PaymentEnumType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static PaymentEnumType getPaymentType(String value) {
        for (PaymentEnumType paymentEnumType : PaymentEnumType.values()) {
            if (paymentEnumType.getValue().equals(value)) {
                return paymentEnumType;
            }
        }
        throw new IllegalArgumentException("Invalid PaymentEnumType: " + value);
    }
}
