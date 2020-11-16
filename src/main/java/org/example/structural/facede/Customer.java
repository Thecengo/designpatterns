package org.example.structural.facede;

public class Customer {

    private String name;
    private Address address;
    private BankAccaunt bankAccaunt;
    private Order order;

    public Customer(String name, Address address, BankAccaunt bankAccaunt, Order order) {
        this.name = name;
        this.address = address;
        this.bankAccaunt = bankAccaunt;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public Address getAddress() {
        return address;
    }
}
