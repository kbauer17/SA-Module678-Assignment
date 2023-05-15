package edu.wctc;

/**
 * public class extending the Factory Ice Cream Store
 * creates one of many ice cream store variants and
 * interacts with ENUM SundaeType to set specific sundaes
 * available in this store
 * @author Kathy Bauer
 * @version 1.0
 */

public class MWIceCreamStore extends IceCreamStore {
    private UI ui;

    public MWIceCreamStore(UI ui) {
        this.ui = ui;
    }

    // method using user selection of a number to instantiate the correct Sundae object
    @Override
    Sundae createDessert(char uInput2) {
        switch(uInput2){
            case '1'-> {return new MWHotFudgeSundae();}
            case '2' -> {return new MWBrownieSundae();}
            case '3' -> {return new MWTurtleSundae();}
            case '4'-> {return new MWBananaSplit();}
            default -> {return null;}
        }

    }

    // method returning a string built from the items available in a specific ice cream store
    @Override
    public String getMenu() {
        StringBuilder sb = new StringBuilder();
        for(SundaeType st:SundaeType.values()){
            sb.append ( (st.ordinal()+1) + ". ");
            sb.append( (MWIceCreamStore.getSundae(st).itemDescription()) + "\n");
        }
        return sb.toString();
    }

    // method using ENUM to instantiate correct Sundae object
    public static Sundae getSundae(SundaeType sundaeType){
        switch (sundaeType){
            case MWHOTFUDGESUNDAE -> {return new MWHotFudgeSundae();}
            case MWBROWNIESUNDAE -> {return new MWBrownieSundae();}
            case MWTURTLESUNDAE -> {return new MWTurtleSundae();}
            case MWBANANASPLIT -> {return new MWBananaSplit();}
            default -> {return null;}
        }
    }
}
