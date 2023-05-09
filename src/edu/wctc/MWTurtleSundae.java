package edu.wctc;

public class MWTurtleSundae extends Sundae{

    public  MWTurtleSundae(){
        name = "Midwest Turtle Sundae";
        dish = "medium round glass bowl";
        flavorIceCream = "vanilla";
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
        System.out.println("Adding 2 scoops of "+flavorIceCream+ " ice cream");
    }
}
