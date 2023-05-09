package edu.wctc;

public class WCBananaSplit extends Sundae{

    public  WCBananaSplit(){
        name = "West Coast Banana Split";
        dish = "oblong glass boat";
        flavorIceCream = "vanilla";
        toppings.add("diced pineapple");
        toppings.add("diced strawberries");
        toppings.add("whipped cream on each scoop");
        toppings.add("hot fudge sauce");
        toppings.add("hot caramel sauce");
        toppings.add("chopped nuts");
        toppings.add("3 maraschino cherries");
    }

    @Override
    void prepare() {
        System.out.println("Preparing the "+dish+" by adding long slices of banana");
    }

    @Override
    void addIceCream() {
        System.out.println("Adding 3 scoops of "+flavorIceCream+ " frozen yogurt");
    }
}
