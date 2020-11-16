package org.example.structural.facede;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class OrderFacadeTest {

    @Test
    void siparisVerilebilmeli() {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.orderGenerate(new Order("order1", 12.10, 1));
        assertDoesNotThrow(() -> new RuntimeException("Bakiye yetersiz !!"));
    }
}