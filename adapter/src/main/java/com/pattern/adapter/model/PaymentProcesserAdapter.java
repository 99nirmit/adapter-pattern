package com.pattern.adapter.model;

public class PaymentProcesserAdapter implements PaymentProcesser{

    private NewPaymentGateway newPaymentGateway;

    public PaymentProcesserAdapter(NewPaymentGateway newPaymentGateway){
        this.newPaymentGateway = newPaymentGateway;
    }

    @Override
    public void makePayment(String paymentDetails) {
        newPaymentGateway.processPayment(paymentDetails);
    }
}
