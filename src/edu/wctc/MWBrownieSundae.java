package edu.wctc;

public class MWBrownieSundae extends Sundae{

    public MWBrownieSundae(){
        name = "Midwest Brownie Sundae";
        dish = "round dessert plate";
        flavorIceCream = "vanilla";
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
