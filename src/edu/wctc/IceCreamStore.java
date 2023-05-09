package edu.wctc;

public abstract class IceCreamStore {

    public Sundae orderDessert(String type){
        Sundae sundae;
        sundae = createDesser(type);
        sundae.prepare();
        sundae.addIceCream();
        sundae.addToppings();
        sundae.finishDessert();
        return sundae;
    }

    abstract Sundae createDesser(String type);

}
