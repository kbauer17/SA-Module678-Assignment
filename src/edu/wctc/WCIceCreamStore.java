package edu.wctc;

public class WCIceCreamStore extends IceCreamStore{
    @Override
    Sundae createDessert(String type) {
        if(type.equals("WCHotFudgeSundae")){
            return new WCHotFudgeSundae();
        } else if (type.equals("WCTurtleSundae")) {
            return new WCTurtleSundae();
        } else if (type.equals("WCBananaSplit")) {
            return new WCBananaSplit();
        } else if (type.equals("WCBrownieSundae")) {
            return new WCBrownieSundae();
        }
        return null;
    }
}
