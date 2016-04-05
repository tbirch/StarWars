/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.view;

import byui.cit260.starwars.controller.GameController;
import starwars.StarWars;

/**
 *
 * @author Daniel
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
            + "\nN - Start new game"
            + "\nL - Load saved game"
            + "\nS - Save current game"
            + "\nH - Help menu"
            + "\nQ - Quit");
    }

    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadSavedGame();
                this.loadSavedGame();
                break;
            case 'S':
                saveCurrentGame();
                this.saveCurrentGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid option");
                break;
        }

        return false;
    }

    private void startNewGame() {
        GameController.createNewGame(StarWars.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadSavedGame() {
        //System.out.println("CALLED START NEW GAME - NOT IMPLEMENTED YET");
    this.console.println("\n\nEnter the file path for file where the game was saved.");
        
        String filePath = this.getInput();
        
        try{
            //Load a saved game
            GameController.getSavedGame(filePath);
            }catch (Exception ex){
                ErrorView.display("MainMenuView", ex.getMessage());
            }
        //Display Game Menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void saveCurrentGame() {
        this.console.println("\n\nEnter the file path for file where the game is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameController.SaveGame(StarWars.getGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
