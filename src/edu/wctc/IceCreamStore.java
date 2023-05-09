package edu.wctc;

public abstract class IceCreamStore {

    public Sundae orderDessert(String type){
        Sundae sundae;
        sundae = createDessert(type);
        sundae.displayOrder();
        sundae.prepare();
        sundae.addIceCream();
        sundae.addToppings();
        sundae.finishDessert();
        return sundae;
    }

    abstract Sundae createDessert(String type);

}
