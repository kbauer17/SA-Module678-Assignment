package edu.wctc;

/**
 * Using ENUM class to designate the type of sundae available
 * @author Kathy Bauer
 * @version 1.0
 */

public enum SundaeType {
    MWHOTFUDGESUNDAE("Midwest Hot Fudge Sundae"),
    MWBROWNIESUNDAE("Midwest Brownie Sundae"),
    MWTURTLESUNDAE("Midwest Turtle Sundae"),
    MWBANANASPLIT("Midwest Banana Split");

    private String prettyPrint;

    private SundaeType(String prettyPrint){
        this.prettyPrint = prettyPrint;
    }

    @Override public  String toString(){
        return prettyPrint;
    }

}
