package org.example.behavioral.tempalatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaMakerTest {

    @Test
    public void testMakePizza() {
        PizzaMaker vegPizzaMaker = new VegPizzaMaker();
        vegPizzaMaker.makePizza();
    }

}