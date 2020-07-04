package org.example.behavioral.tempalatemethod;

public abstract class PizzaMaker {
    public void makePizza() {
        preparedPizzaDough();
        preBakeCrust();
        prepareIngredients();
        addToppings();
        bakePizza();
        if (customerWantsPackedPizza()) {
            packPizza();
        }
    }

    final void preparedPizzaDough() {
        System.out.println("Preparing pizza dough");
    }

    final void preBakeCrust() {
        System.out.println("Pre baking crust at 325 F for 3 minutes");
    }

    public abstract void prepareIngredients();

    public abstract void addToppings();

    void bakePizza() {
        System.out.println("Baking pizza at 400 F for 12 minutes");
    }

    void packPizza() {
        System.out.println("Packing pizza in pizza delivery box");
    }

    boolean customerWantsPackedPizza() {
        return true;
    }
}
