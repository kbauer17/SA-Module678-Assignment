package edu.wctc;

/**
 * public class extending Sundae, providing specific
 * elements needed for a variant of Sundae
 * @author Kathy Bauer
 * @version 1.0
 */

public class MWBrownieSundae extends Sundae{

    public MWBrownieSundae(){
        name = "Midwest Brownie Sundae";
        dish = "round dessert plate";
        flavorIceCream = "vanilla ice cream";
        toppings.add("hot fudge sauce");
    }

    // method returning a string with specifics of preparing this sundae object
    @Override
    String prepare() {
        return "Preparing the "+dish+" by drizzling hot fudge sauce then centering the large square brownie";
    }

    // method returning a string with specifics of scoops of frozen item added to this sundae object
    @Override
    String addIceCream() {
        return "Adding 1 large scoop of "+flavorIceCream;
    }
}
