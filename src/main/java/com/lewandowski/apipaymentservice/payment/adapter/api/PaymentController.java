package com.lewandowski.apipaymentservice.payment.adapter.api;

import com.lewandowski.apipaymentservice.payment.domain.model.Order;
import com.lewandowski.apipaymentservice.payment.domain.port.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    Order makePayment(@RequestBody final Order order) {
        return paymentService.makePayment(order);
    }
}
