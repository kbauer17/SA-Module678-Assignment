package edu.wctc;

public class MWIceCreamStore extends IceCreamStore {
    @Override
    Sundae createDesser(String type) {
        if(type.equals("MWHotFudgeSundae")){
            return new MWHotFudgeSundae();
        }
        return null;
    }
}
