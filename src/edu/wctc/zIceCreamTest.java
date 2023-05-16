package edu.wctc;

import org.junit.Test;
import static org.junit.Assert.*;

public class zIceCreamTest {
    IOStrategy ioStrategy = new ConsoleIOStrategy();
    UI ui = new UI(ioStrategy);
    IceCreamStore store;
    char uInput;


    @Test
    public void getSundaeTest(){
        // test to ensure Sundae types in the ENUM listing are all included in this method
        for(SundaeType st : SundaeType.values()){
            assertNotNull("Sundae type (ENUM) match not found in getSundae",MWIceCreamStore.getSundae(st));
        }
    }

    @Test
    public void getSundaeWCTest(){
        // test to ensure Sundae types in the ENUM listing are all included in this method
        for(SundaeTypeWC stw : SundaeTypeWC.values()){
            assertNotNull("Sundae type WC (ENUM) match not found in getSundae",WCIceCreamStore.getSundae(stw));
        }
    }

    @Test
    public void createDessertTest(){
        // test to ensure Sundae types in the ENUM listing match the options in createDessert() method
        store = new MWIceCreamStore(ui);
        uInput = Integer.toString(SundaeType.values().length).charAt(0);
        assertNotNull("SundaeType ENUM list and createDessert list do not match",store.createDessert(uInput));
    }

    @Test
    public void createDessertWCTest(){
        // test to ensure Sundae types in the ENUM listing match the options in createDessert() method
        store = new WCIceCreamStore(ui);
        uInput = Integer.toString(SundaeTypeWC.values().length).charAt(0);
        assertNotNull("SundaeTypeWC ENUM list and createDessert list do not match",store.createDessert(uInput));
    }
}
