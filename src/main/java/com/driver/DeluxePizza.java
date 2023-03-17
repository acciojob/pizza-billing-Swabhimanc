package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // Add extra cheese
        addExtraCheese();

        // Add extra toppings based on pizza type
        if (isVeg) {
            addExtraToppings(); // Add veg toppings for veg pizza
        } else {
            addExtraToppings(); // Add non-veg toppings for non-veg pizza
        }
    }
}
