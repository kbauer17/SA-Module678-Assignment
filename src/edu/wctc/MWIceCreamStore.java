package edu.wctc;

public class MWIceCreamStore extends IceCreamStore {
    @Override
    Sundae createDesser(String type) {
        if(type.equals("MWHotFudgeSundae")){
            return new MWHotFudgeSundae();
        } else if (type.equals("MWTurtleSundae")) {
            return new MWTurtleSundae();
        } else if (type.equals("MWBananaSplit")) {
            return new MWBananaSplit();
        } else if (type.equals("MWBrownieSundae")) {
            return new MWBrownieSundae();
        }
        return null;
    }
}
