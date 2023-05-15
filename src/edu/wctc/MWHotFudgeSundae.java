package edu.wctc;

/**
 * public class extending Sundae, providing specific
 * elements needed for a variant of Sundae
 * @author Kathy Bauer
 * @version 1.0
 */

public class MWHotFudgeSundae extends Sundae{

    public MWHotFudgeSundae(){
        name = "Midwest Hot Fudge Sundae";
        dish = "medium round glass bowl";
        flavorIceCream = "vanilla ice cream";
        toppings.add("hot fudge sauce");
        toppings.add("whipped cream");
        toppings.add("chopped nuts");
        toppings.add("maraschino cherry");
    }

    // method returning a string with specifics of preparing this sundae object
    @Override
    String prepare() {
        return "Preparing the "+dish+ " by adding a swirl of hot fudge sauce";
    }

    // method returning a string with specifics of scoops of frozen item added to this sundae object
    @Override
    String addIceCream() {
        return "Adding 2 scoops of "+flavorIceCream;
    }

}
