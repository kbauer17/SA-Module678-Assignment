package edu.wctc;

public class Main {
    public static void main(String[] args) {
        IceCreamStore mwStore = new MWIceCreamStore();

        System.out.println("You have ordered a hot fudge sundae");
        Sundae sundae = mwStore.orderDessert("MWHotFudgeSundae");

        System.out.println("You have ordered a turtle sundae");
        sundae = mwStore.orderDessert("MWTurtleSundae");

        System.out.println("You have ordered a banana split");
        sundae = mwStore.orderDessert("MWBananaSplit");

        System.out.println("You have ordered a brownie sundae");
        sundae = mwStore.orderDessert("MWBrownieSundae");
    }

}
