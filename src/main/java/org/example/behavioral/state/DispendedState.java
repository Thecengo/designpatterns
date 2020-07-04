package org.example.behavioral.state;

public class DispendedState implements CandyVendingMachineState{

    CandyVendingMachine machine;

    public DispendedState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Error. System is currently dispending");
    }

    @Override
    public void pressButton() {
        System.out.println("Error. System is currently dispending");
    }

    @Override
    public void dispense() {
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoCoinState());
            machine.setCount(machine.getCount() - 1);
        }
        else {
            System.out.println("No candies avaliable");
            machine.setState(machine.getNoCandyState());
        }
    }

    @Override
    public String toString() {
        return "DispendedState";
    }
}
