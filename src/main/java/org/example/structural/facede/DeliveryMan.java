package org.example.structural.facede;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DeliveryMan {

    private String name;
    private List<Order> orders;

    public DeliveryMan(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    public void deliverOrder(Customer customer) {
        orders.stream().filter(getOrderPredicate(customer)).map(getOrderStringFunction(customer)).forEach(System.out::println);
    }

    private Function<Order, String> getOrderStringFunction(Customer customer) {
        return order -> order.getName() + " siparisi " + customer.getAddress() + " adresine teslim edildi";
    }

    private Predicate<Order> getOrderPredicate(Customer customer) {
        return order -> customer.getOrder().getName().equals(order.getName());
    }
}
