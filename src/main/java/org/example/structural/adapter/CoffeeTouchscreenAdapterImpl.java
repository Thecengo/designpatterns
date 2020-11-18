package org.example.structural.adapter;

public class CoffeeTouchscreenAdapterImpl implements CoffeeMachineAdapter {

    private OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchscreenAdapterImpl(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.select1();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.select2();
    }
}
