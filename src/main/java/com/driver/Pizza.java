package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isCheeseAdded;

    private boolean isToppingsAdded;

    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

    private int extraToppings;
    private int cheese;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";

        if(isVeg){
            this.price = 300;
            this.extraToppings = 70;
        }else{
            this.price = 400;
            this.extraToppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price +"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded) {
            this.price = this.price + cheese;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            this.price = this.price + this.extraToppings;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {

            if (isCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            if (isToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.extraToppings + "\n";
            }
            if (isTakeAwayAdded) {
                this.bill += "Paperbag Added: " +20 + "\n";
            }

            this.bill += "Total Price: " + this.price +"\n";
            isBillGenerated = true;
        }

        return this.bill;
    }
}
