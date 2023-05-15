package edu.wctc;

/**
 * Interface providing methods for input/output
 * @author Kathy Bauer
 * @version 1.0
 */
public interface IOStrategy {
    char inputCharacter();
    String inputString();
    void outputLine(String line);
}
