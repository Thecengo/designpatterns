package org.example.structural.facede;

public class BankAccaunt {

    private Double balance;

    public BankAccaunt(Double balance) {
        this.balance = balance;
    }

    public void sendMoneyForOrder(Order order) {
        if (order.getPrice() < this.balance) {
            System.out.println("Sipariş için para gönderildi. Hesap bilgileri doğrulandı");
        }
        else {
            throw new RuntimeException("Bakiye yetersiz !!");
        }
    }
}
