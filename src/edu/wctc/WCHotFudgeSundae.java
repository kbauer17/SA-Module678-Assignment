package edu.wctc;

public class WCHotFudgeSundae extends Sundae{

    public WCHotFudgeSundae(){
        name = "West Coast Hot Fudge";
        dish = "medium round glass bowl";
        flavorIceCream = "chocolate";
        toppings.add("hot fudge sauce");
        toppings.add("whipped cream");
        toppings.add("chopped nuts");
        toppings.add("maraschino cherry");
    }

    @Override
    void prepare() {
        System.out.println("Preparing the "+dish+ " by adding a swirl of hot fudge sauce");
    }

    @Override
    void addIceCream() {
        System.out.println("Adding 2 scoops of "+flavorIceCream+ " frozen yogurt");
    }
}
