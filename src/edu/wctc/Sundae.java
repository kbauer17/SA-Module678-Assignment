package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public abstract class Sundae {
    String name;
    String dish;
    String flavorIceCream;
    List<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Preparing the "+dish);
    }

    void addIceCream(){
        System.out.println("Adding scoops of "+ flavorIceCream + "ice cream");
    }

    void addToppings(){
        System.out.println("Adding toppings:");
        for(String topping : toppings){
            System.out.println(" "+ topping);
        }
    }

    void finishDessert(){
        System.out.println("Finishing with a spoon and napkin.  Enjoy!");
    }

    public String getName(){
        return name;
    }
}
