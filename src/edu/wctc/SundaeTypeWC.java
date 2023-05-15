package edu.wctc;

/**
 * Using ENUM class to designate the type of sundae available
 * @author Kathy Bauer
 * @version 1.0
 */

public enum SundaeTypeWC {
    WCHOTFUDGESUNDAE("Cali Hot Fudge Sundae"),
    WCBROWNIESUNDAE("Cali Brownie Sundae"),
    WCTURTLESUNDAE("Cali Turtle Sundae"),
    WCBANANASPLIT("Cali Banana Split");

    private String prettyPrint;

    private SundaeTypeWC(String prettyPrint){
            this.prettyPrint = prettyPrint;
        }

    @Override public String toString(){
            return prettyPrint;
        }

}
