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
        return paymentGateway.makePayment(order);
    }
}
