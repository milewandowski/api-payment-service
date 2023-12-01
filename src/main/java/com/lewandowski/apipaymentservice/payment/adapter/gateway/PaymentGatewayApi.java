package com.lewandowski.apipaymentservice.payment.adapter.gateway;

import com.lewandowski.apipaymentservice.payment.domain.model.Order;
import com.lewandowski.apipaymentservice.payment.domain.port.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
class PaymentGatewayApi implements PaymentGateway {

    @Override
    public void makePayment(Order order) {
        // Mocked payment gateway call
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
