package org.example.structural.facede;

import java.util.ArrayList;
import java.util.List;

public class OrderFacade {

    private BankAccaunt bankAccaunt = new BankAccaunt(25.30);
    private Customer customer;
    private DeliveryMan deliveryMan = new DeliveryMan("Ali", getDeliveryManOrders());

    public void orderGenerate(Order order) {
        customer = new Customer("Cengiz", new Address("İstanbul"), bankAccaunt, order);
        bankAccaunt.sendMoneyForOrder(order);
        deliveryMan.deliverOrder(customer);
    }

    private List<Order> getDeliveryManOrders() {
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            orders.add(new Order("order" + i, i + 1.30, i));
        }
        return orders;
    }
}

