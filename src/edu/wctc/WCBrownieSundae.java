package edu.wctc;

public class WCBrownieSundae extends Sundae{

    public WCBrownieSundae(){
        name = "West Coast Brownie Sundae";
        dish = "round dessert plate";
        flavorIceCream = "chocolate";
        toppings.add("hot fudge sauce");
    }

    @Override
    void prepare() {
        System.out.println("Preparing the "+dish+" by drizzling hot fudge sauce then centering the large square brownie");
    }

    @Override
    void addIceCream() {
        System.out.println("Adding 1 large scoop of "+flavorIceCream+" ice cream");
    }
}
