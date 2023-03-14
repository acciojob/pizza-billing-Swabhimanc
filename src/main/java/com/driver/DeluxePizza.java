package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg)
    {
        super(isVeg);
        Pizza pizza = new Pizza(isVeg);
        pizza.addExtraCheese();
        pizza.addExtraToppings();
    }
}
