package edu.wctc;

/**
 * Abstract Factory class, sets the minimum requirements for an ice cream store
 * @author Kathy Bauer
 * @version 1.0
 */
public abstract class IceCreamStore {

    public Sundae orderDessert(char uInput2){
        Sundae sundae;
        sundae = createDessert(uInput2);
        sundae.displayOrder();
        sundae.prepare();
        sundae.addIceCream();
        sundae.addToppings();
        sundae.finishDessert();
        return sundae;
    }

    abstract Sundae createDessert(char uInput2);

    public abstract String getMenu();
}
