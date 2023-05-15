package edu.wctc;

/**
 * Singleton class controlling input and output
 * @author Kathy Bauer
 * @version 1.0
 */

public class UI {
    private static UI ui;
    private IOStrategy ioStrategy;

    // constructor
    public UI(IOStrategy ioStrategy) {
        this.ioStrategy = ioStrategy;
    }

    // create the instance of the Singleton UI; global access point
    public static UI getInstance(IOStrategy ioStrategy){
        if(ui == null){
            ui = new UI(ioStrategy);
        }
        return ui;
    }

    // create a user interface for obtaining store location
    public char getStoreRegion(){
        ioStrategy.outputLine("Are you working in (M)ilwaukee or vacationing in (S)an Diego?");
        return ioStrategy.inputCharacter();
    }

    // display product menu and return the user selection
    public char getStoreMenu(IceCreamStore store){
        ioStrategy.outputLine(store.getMenu());
        return ioStrategy.inputCharacter();
    }

    // build the sundae to the console
    public void buildSundae(Sundae sundae) throws IndexOutOfBoundsException {
        // test for sundae is null, which occurs if the user menu selection is outside the range
        if(sundae == null){
            throw new IndexOutOfBoundsException("Invalid entry, exiting program.  Goodbye!");
        }else {
            ioStrategy.outputLine(sundae.displayOrder() + "\n\t" + sundae.prepare() + "\n\t" +
                    sundae.addIceCream() + "\n\t" + sundae.addToppings() + "\t" +
                    sundae.finishDessert() + "\n");
        }
    }
}
