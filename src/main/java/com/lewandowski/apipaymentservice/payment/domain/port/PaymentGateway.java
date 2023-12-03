package com.lewandowski.apipaymentservice.payment.domain.port;

import com.lewandowski.apipaymentservice.payment.domain.model.Order;

public interface PaymentGateway {

    Order makePayment(Order order);
}
