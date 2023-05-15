package edu.wctc;

/**
 * abstract class defining the minimum requirements for each Sundae
 * @author Kathy Bauer
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Sundae {
    String name;
    String dish;
    String flavorIceCream;
    List<String> toppings = new ArrayList<String>();


    // method returning a String built from the name of the sundae,
    // the type of ice cream used and a list of the toppings
    // this is used in creating a menu from which the user selects a sundae

    String itemDescription(){
        String str = name+":  "+flavorIceCream+", ";
        for(String topping : toppings){
            str += topping +", ";
        }
        return str;
    }

    String displayOrder(){
        return "You have ordered a "+getName();
    }
    String prepare(){
        return "Preparing the "+dish;
    }

    String addIceCream(){
        return "Adding scoops of "+ flavorIceCream + "ice cream";
    }

    String addToppings(){
        StringBuilder sb = new StringBuilder();
        sb.append("Adding toppings:\n");
        for(String topping : toppings){
            sb.append("\t\t"+ topping + "\n");
        }
        return sb.toString();
    }

    String finishDessert(){
        return "Finishing with a spoon and napkin.  Enjoy!\n";
    }

    public String getName(){
        return name;
    }
}
