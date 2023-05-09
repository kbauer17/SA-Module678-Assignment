package edu.wctc;

public class Main {
    public static void main(String[] args) {
        IceCreamStore mwStore = new MWIceCreamStore();

        System.out.println("You have ordered a hot fudge sundae");
        Sundae sundae = mwStore.orderDessert("MWHotFudgeSundae");

    }

}
