package edu.wctc;

/**
 * Driver class for this package
 * @author Kathy Bauer
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        IOStrategy ioStrategy;      //an instance of IOStrategy is now available to the package

        switch (args[0].indexOf(0)){        // allow arguments to set the IO strategy
            case 'C': ioStrategy = new ConsoleIOStrategy();break;
            default: ioStrategy = new ConsoleIOStrategy();
        }

        UI ui = UI.getInstance(ioStrategy); // access the singleton UI

        // provide access to the Ice Cream Stores (this is the abstract Factory class)
        IceCreamStore store;

        //instantiate the concrete ice cream store based on user's region response
        char region = ' ';
        try {
            region = ui.getStoreRegion();   // asking user for region
            switch (region) {    // set the store to the selected region
                case 'm':
                case 'M':
                    // this selection is the same as the default but kept here to allow easier
                    // factory expansion or change in handling erroneous user input
                    store = new MWIceCreamStore(ui);
                    break;
                case 's':
                case 'S':
                    store = new WCIceCreamStore(ui);
                    break;
                default:
                    store = new MWIceCreamStore(ui);
            }

            // provide a menu to the user and act on their input
            char uInput = ' ';
            do {
                ioStrategy.outputLine("Please choose from today's selections (x to exit):");
                uInput = ui.getStoreMenu(store);

                if(uInput != 'X')
                    ui.buildSundae(store.createDessert(uInput));

            } while (uInput != 'X');

            ioStrategy.outputLine("Thank you and goodbye for now!");
        }
        catch(Exception e){
            ioStrategy.outputLine("Exception => "+e);
        }

    }

}
