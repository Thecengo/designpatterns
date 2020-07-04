package org.example.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CandyVendingMachineTest {

    @Test
    public void testVendingMachine(){
        CandyVendingMachine machine = new CandyVendingMachine(3);
        System.out.println(machine);
        machine.insertCoin();
        System.out.println(machine);
        machine.pressButton();
        System.out.println(machine);
    }
}