/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import starwars.StarWars;

/**
 *
 * @author Daniel
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = StarWars.getInFile();
    protected final PrintWriter console = StarWars.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false;
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(value);
        } while (!done);

    }

    @Override
    public String getInput() {
        
        String input = " ";
        boolean validInput = false;

        while (!validInput) {
            System.out.println("\n" + this.displayMessage);

            input = this.keyboard.readLine();
            input = input.trim();
            input = input.toUpperCase();

            if (input.length() < 1) {
                System.out.println("\nInvalid value: You must enter a character.");
                continue;
            }
            break;
        }
        return input;
    }

}
