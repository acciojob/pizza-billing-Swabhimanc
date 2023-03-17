package com.driver;

public class Main {
  public static void main(String[] args) {

    // Create a deluxe veg pizza with extra cheese and takeaway
    DeluxePizza dp = new DeluxePizza(true);
    dp.addExtraCheese(); // Adding extra cheese again (will not affect bill as it is already added in constructor)
    dp.addTakeaway();
    System.out.println(dp.getBill());

    // Create a regular veg pizza with extra cheese, extra toppings, and takeaway
    Pizza p = new Pizza(true);

    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());

  }
}
