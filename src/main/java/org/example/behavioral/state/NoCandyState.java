package org.example.behavioral.state;

public class NoCandyState implements CandyVendingMachineState{

    CandyVendingMachine machine;

    public NoCandyState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No candies avaliable");
    }

    @Override
    public void pressButton() {
        System.out.println("No candies avaliable");
    }

    @Override
    public void dispense() {
        System.out.println("No candies avaliable");
    }

    @Override
    public String toString() {
        return "NoCandyState";
    }
}
