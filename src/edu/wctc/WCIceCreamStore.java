package edu.wctc;

/**
 * public class extending the Factory Ice Cream Store
 * creates one of many ice cream store variants and
 * interacts with ENUM SundaeTypeWC to set specific sundaes
 * available in this store
 * @author Kathy Bauer
 * @version 1.0
 */

public class WCIceCreamStore extends IceCreamStore{
    private UI ui;

    public WCIceCreamStore(UI ui) {
        this.ui = ui;
    }

    // method using user selection of a number to instantiate the correct Sundae object
    @Override
    Sundae createDessert(char uInput2) {
        switch (uInput2) {
            case '1'-> {return new WCHotFudgeSundae();}
            case '2' -> {return new WCBrownieSundae();}
            case '3' -> {return new WCTurtleSundae();}
            case '4' -> {return new WCBananaSplit();}
            default -> {return null;}
        }
    }

    // method returning a string built from the items available in a specific ice cream store
    @Override
    public String getMenu() {
        StringBuilder sb = new StringBuilder();
        for(SundaeTypeWC st:SundaeTypeWC.values()){
            sb.append ( (st.ordinal()+1) + ". ");
            sb.append( (WCIceCreamStore.getSundae(st).itemDescription()) + "\n");
        }
        return sb.toString();
    }

    // method using ENUM to instantiate correct Sundae object
    public static Sundae getSundae(SundaeTypeWC sundaeType){
        switch (sundaeType){
            case WCHOTFUDGESUNDAE -> {return new WCHotFudgeSundae();}
            case WCBROWNIESUNDAE -> {return new WCBrownieSundae();}
            case WCTURTLESUNDAE -> {return new WCTurtleSundae();}
            case WCBANANASPLIT -> {return new WCBananaSplit();}
            default -> {return null;}
        }
    }
}
