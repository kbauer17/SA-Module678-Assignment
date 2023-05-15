package edu.wctc;

/**
 * public class extending Sundae, providing specific
 * elements needed for a variant of Sundae
 * @author Kathy Bauer
 * @version 1.0
 */

public class WCBananaSplit extends Sundae{

    public  WCBananaSplit(){
        name = "West Coast Banana Split";
        dish = "oblong glass boat";
        flavorIceCream = "vanilla frozen yogurt";
        toppings.add("diced pineapple");
        toppings.add("diced strawberries");
        toppings.add("whipped cream on each scoop");
        toppings.add("hot fudge sauce");
        toppings.add("hot caramel sauce");
        toppings.add("chopped nuts");
        toppings.add("3 maraschino cherries");
    }

    // method returning a string with specifics of preparing this sundae object
    @Override
    String prepare() {
        return "Preparing the "+dish+" by adding long slices of banana";
    }

    // method returning a string with specifics of scoops of frozen item added to this sundae object
    @Override
    String addIceCream() {
        return "Adding 3 scoops of "+flavorIceCream;
    }
}
