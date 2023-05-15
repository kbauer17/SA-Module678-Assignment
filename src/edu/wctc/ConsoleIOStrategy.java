package edu.wctc;

import java.util.Scanner;

/**
 * A public class providing specific input/output methods
 * @author Kathy Bauer
 * @version 1.0
 */

public class ConsoleIOStrategy implements IOStrategy{

    private Scanner keyboard = new Scanner(System.in);

    @Override
    public char inputCharacter() {
        return this.inputString().toUpperCase().charAt(0);
    }

    @Override
    public String inputString() {
        return keyboard.nextLine();
    }

    @Override
    public void outputLine(String line) {
        System.out.println(line);
    }
}
