package org.example.behavioral.state;

public class CandyVendingMachine {

    CandyVendingMachineState noCoinState;
    CandyVendingMachineState containCoinState;
    CandyVendingMachineState dispendedState;
    CandyVendingMachineState noCandyState;
    CandyVendingMachineState state;
    int count;

    public CandyVendingMachine(int numberOfCandies) {
        count = numberOfCandies;
        this.noCoinState = new NoCoinState(this);
        this.containCoinState = new ContainsCoinState(this);
        this.noCandyState = new NoCandyState(this);
        this.dispendedState = new DispendedState(this);
        state = noCoinState;
    }

    public void refillyCandy(int count) {
        this.count += count;
        this.state = noCoinState;
    }

    public void ejectCandy() {
        if (count != 0) {
            count--;
        }
    }

    public void insertCoin() {
        System.out.println("You inserted a coin");
        state.insertCoin();
    }

    public void pressButton() {
        System.out.println("You have pressed the button");
        state.pressButton();
        state.dispense();
    }

    public CandyVendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(CandyVendingMachineState noCoinState) {
        this.noCoinState = noCoinState;
    }

    public CandyVendingMachineState getContainCoinState() {
        return containCoinState;
    }

    public void setContainCoinState(CandyVendingMachineState containCoinState) {
        this.containCoinState = containCoinState;
    }

    public CandyVendingMachineState getDispendedState() {
        return dispendedState;
    }

    public void setDispendedState(CandyVendingMachineState dispendedState) {
        this.dispendedState = dispendedState;
    }

    public CandyVendingMachineState getNoCandyState() {
        return noCandyState;
    }

    public void setNoCandyState(CandyVendingMachineState noCandyState) {
        this.noCandyState = noCandyState;
    }

    public CandyVendingMachineState getState() {
        return state;
    }

    public void setState(CandyVendingMachineState state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String machineDef = "Current state of machine " + state + ". Candies available " + count;
        return machineDef;
    }
}
