package org.example.behavioral.state;

public class NoCoinState implements CandyVendingMachineState{

    CandyVendingMachine machine;

    public NoCoinState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        machine.setState(machine.getContainCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inserted");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted");
    }

    @Override
    public String toString() {
        return "NoCoinState";
    }
}
