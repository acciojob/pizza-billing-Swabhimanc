package com.driver;

public class Pizza {

    private int price;
    private int base;
    private boolean isVeg;
    private String bill;

    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean paperBagAdded = false;

    private int extraCheesePrice = 80;
    private int vegToppingsPrice = 70;
    private int nonVegToppingsPrice = 120;
    private int paperBagPrice = 20;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;

        if (isVeg) {
            price = 300;
            base=300;
        } else {
            price = 400;
            base=400;
        }
    }

    public int getPrice() {
        return price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            price += extraCheesePrice;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            if (isVeg) {
                price += vegToppingsPrice;
            } else {
                price += nonVegToppingsPrice;
            }
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!paperBagAdded) {
            price += paperBagPrice;
            paperBagAdded = true;
        }
    }

    public String getBill() {
        String ans = "";
        ans = ans + "Base Price Of The Pizza: " + base + "\n";

        if (extraCheeseAdded) {
            ans = ans + "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (extraToppingsAdded) {
            if (isVeg) {
                ans = ans + "Extra Toppings Added: " + vegToppingsPrice + "\n";
            } else {
                ans = ans + "Extra Toppings Added: " + nonVegToppingsPrice + "\n";
            }
        }

        if (paperBagAdded) {
            ans = ans + "Paperbag Added: " + paperBagPrice + "\n";
        }

        ans += "Total Price: " + price + "\n";
        this.bill = ans;
        return ans;
    }
}
