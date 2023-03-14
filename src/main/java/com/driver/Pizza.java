package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private static int vegToppings=0;
    private static int nonVegToppings=0;
    private static int paperbag=0;
    private static int extraCheese=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg==true)
        {
            this.price=300;
        }
        else
        {
            this.price=400;
        }
    }
    public Pizza(){}

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        this.extraCheese=80;
    }

    public void addExtraToppings(){
        if(this.isVeg==true)
        {
            this.vegToppings=70;
        }
        else
        {
            this.nonVegToppings=120;
        }
    }

    public void addTakeaway(){
        this.paperbag=20;
    }

    public String getBill()
    {
        String ans="";
        ans=ans+"Base Price Of The Pizza: "+this.price+"\n";

        if(this.extraCheese!=0)
        {
            ans=ans+"Extra Cheese Added: "+this.extraCheese+"\n";
        }
        if(this.vegToppings!=0)
        {
            ans=ans+"Extra Toppings Added: "+this.vegToppings+"\n";
        }
        else if(this.nonVegToppings!=0)
        {
            ans=ans+"Extra Toppings Added: "+this.nonVegToppings+"\n";
        }

        if(this.paperbag!=0)
        {
            ans=ans+"Paperbag Added: "+this.paperbag+"\n";
        }
        int total=this.price+this.paperbag+this.extraCheese+this.vegToppings+this.nonVegToppings;
        ans+="Total Price: "+total+"\n";
        this.bill=ans;
        return this.bill;
    }
}
