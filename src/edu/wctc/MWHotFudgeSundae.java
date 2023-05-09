package edu.wctc;

public class MWHotFudgeSundae extends Sundae{

    public MWHotFudgeSundae(){
        name = "Midwest Hot Fudge edu.wctc.Sundae";
        dish = "medium round glass bowl";
        flavorIceCream = "vanilla";
        toppings.add("hot fudge sauce");
        toppings.add("whipped cream");
        toppings.add("chopped nuts");
        toppings.add("maraschino cherry");
    }

    @Override
    void prepare() {
        System.out.println("Preparing the "+dish+ "add adding a swirl of hot fudge sauce");
    }

    @Override
    void addIceCream() {
        System.out.println("Adding 2 scoops of "+flavorIceCream+ " ice cream");
    }
}
