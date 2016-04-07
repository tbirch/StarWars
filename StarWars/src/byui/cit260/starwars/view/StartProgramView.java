/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.view;

import byui.cit260.starwars.controller.GameController;
import byui.cit260.starwars.model.Player;
import java.util.Scanner;
import starwars.StarWars;


/**
 *
 * @author Daniel
 */
public class StartProgramView {
    
    public StartProgramView() {
        
    }
    
    public void startProgram() {
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        Player player = GameController.createPlayer(playerName);
        
        StarWars.setPlayer(player);
        
        displayWelcomeMessage(player.getName());
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    public String getPlayerName() {
        
        boolean isValidName = false;
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        
        while(!isValidName) {
            String input = keyboard.nextLine();
            
            if(input == null || input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                System.out.println("Input is invalid - name must be at least 2 characters");
            }
        }
        
        return name;
    }
    
    public void displayBanner() {
        String welcome = "";
        welcome = "Welcome Future Jedi Master!";
                
        
        System.out.println(welcome);
    }
    
    public void displayWelcomeMessage(String playerName) {
        //TODO ANOTHER BANNER
        System.out.println("==============================");
        System.out.println("Welcome " + playerName + ".");
        System.out.println("Enjoy the game!");
        System.out.println("==============================");
        
    }
    
}
