package org.example.structural.adapter;

public class Client {

    public static void main(String[] args) {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeMachineAdapter coffeeMachineAdapter = new CoffeeTouchscreenAdapterImpl(oldCoffeeMachine);
        coffeeMachineAdapter.chooseFirstSelection();
        coffeeMachineAdapter.chooseSecondSelection();
    }
}
