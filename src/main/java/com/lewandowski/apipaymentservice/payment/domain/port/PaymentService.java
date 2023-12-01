package com.lewandowski.apipaymentservice.payment.domain.port;

import com.lewandowski.apipaymentservice.payment.domain.model.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public final class PaymentService {

    private final PaymentGateway paymentGateway;

    public Order makePayment(Order order) {
        paymentGateway.makePayment(order);
        log.info("Payment made for order with id: {}", order.getId());

        return order;
    }
}
