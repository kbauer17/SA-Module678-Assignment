package edu.wctc;

public class WCTurtleSundae extends Sundae{

    public  WCTurtleSundae(){
        name = "West Coast Turtle Sundae";
        dish = "medium round glass bowl";
        flavorIceCream = "chocolate";
        toppings.add("hot fudge sauce");
        toppings.add("hot caramel sauce");
        toppings.add("chopped nuts");
    }

    @Override
    void prepare() {
        System.out.println("Preparing the "+dish+" by adding a swirl of hot fudge sauce then adding a swirl of hot caramel sauce");
    }

    @Override
    void addIceCream() {
        System.out.println("Adding 2 scoops of "+flavorIceCream+ " frozen yogurt");
    }
}
