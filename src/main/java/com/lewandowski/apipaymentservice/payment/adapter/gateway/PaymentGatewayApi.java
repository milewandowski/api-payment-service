package com.lewandowski.apipaymentservice.payment.adapter.gateway;

import com.lewandowski.apipaymentservice.payment.domain.model.Order;
import com.lewandowski.apipaymentservice.payment.domain.port.PaymentGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
class PaymentGatewayApi implements PaymentGateway {

    @Override
    public Order makePayment(Order order) {
        // Mocked payment gateway call
        // Only for research purpose - don't do it at home pls
        try {
            Thread.sleep(50L);
            log.info("Payment made for order with id: {}", order.getId());
            return order;
        } catch (InterruptedException e) {
            log.error("Payment failed for order with id: {}", order.getId());
            throw new RuntimeException(e);
        }
    }
}
