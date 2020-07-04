package org.example.behavioral.tempalatemethod;

public class NonVegPizzaMaker extends PizzaMaker{
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing chicken ham, onion, chicken sausages, and smoked chicken");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding mozzerella cheese and tomato sauce along with ingredients to crust.");
    }
}
