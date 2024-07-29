package com.pattern.adapter.model;

public class NewPaymentGateway {

    void processPayment(String paymentDetails){
        System.out.println("Processing payment with new gateway: " + paymentDetails);
    }
}
