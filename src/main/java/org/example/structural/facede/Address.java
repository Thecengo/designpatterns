package org.example.structural.facede;

public class Address {
    private String addressName;

    public Address(String addressName) {
        this.addressName = addressName;
    }

    @Override
    public String toString() {
        return addressName;
    }
}
