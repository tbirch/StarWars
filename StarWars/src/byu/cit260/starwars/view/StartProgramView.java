/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.starwars.view;

import byui.cit260.starwars.model.Player;
import java.util.Scanner;

/**
 *
 * @author jasonplatter
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
    // promptMessage = "Please enter your name"
        this.promptMessage = "\nPlease enter yourname: ";
    // display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
       System.out.println(
               "\n*********************************************"
             + "\n*                                           *"
                       + "\n* Put the StarWars game description here      *"
                       + ""
       );
    }

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit program
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {

        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; //end the loop
        }
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
    }
    
    // call createPlayer() control function
    Player player = GameControl.createPlayer(playerName);
    
    if (player == null) {
    System.out.println("\nErro creating the player.");
    return false;
    
}
}
