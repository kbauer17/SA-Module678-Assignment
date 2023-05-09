package edu.wctc;

public class Main {
    public static void main(String[] args) {
        IceCreamStore mwStore = new MWIceCreamStore();
        IceCreamStore wcStore = new WCIceCreamStore();

        Sundae sundae = mwStore.orderDessert("MWHotFudgeSundae");

        sundae = mwStore.orderDessert("MWTurtleSundae");

        sundae = mwStore.orderDessert("MWBananaSplit");

        sundae = mwStore.orderDessert("MWBrownieSundae");

        sundae = wcStore.orderDessert("WCHotFudgeSundae");

        sundae = wcStore.orderDessert("WCTurtleSundae");

        sundae = wcStore.orderDessert("WCBananaSplit");

        sundae = wcStore.orderDessert("WCBrownieSundae");

    }

}
