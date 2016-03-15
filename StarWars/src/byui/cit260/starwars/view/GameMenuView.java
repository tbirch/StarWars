/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.view;

import byui.cit260.starwars.model.Location;
import starwars.StarWars;

/**
 *
 * @author Daniel
 */
public class GameMenuView extends View {

    public GameMenuView() { //TODO this
        super("\n"
                + "\nP - Search for people"
                + "\nN - Move North"
                + "\nE - Move East"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\nM - View Map"
                + "\nL - View Current Location"
                + "\nH - View Current Health"
                + "\nQ - Quit");
    }

    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);

        switch (charSel) {
            case 'P':
                searchPeople();
                break;
            case 'N':
                moveNorth();
                break;
            case 'E':
                moveEast();
                break;
            case 'S':
                moveSouth();
                break;
            case 'W':
                moveWest();
                break;
            case 'M':
                viewMap();
                break;
            case 'L':
                viewCurrentLocation();
                break;
            case 'H':
                viewHealth();
            case 'Q':
                return true;
            default:
                System.out.println("Invalid option");
                break;
        }

        return false;
    }

    private void searchPeople() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveNorth() {
//        MovementController mc = new MovementController();
//        if(mc.moveNorth(SaveTheCity.getGame()) == false) {
//            System.out.println("You cannot move there");
//        }
    }

    private void moveEast() {
        //TODO DON'T DO THIS
        Location loc = StarWars.getGame().getPlayer().getLocation();
        Location newLoc = StarWars.getGame().getMap().getLocation(loc.getRow(), loc.getCol() + 1);
        StarWars.getGame().getPlayer().setLocation(newLoc);
        
        if(newLoc.getEnemy() != null) {
            BattleView bv = new BattleView();
            bv.display();
        }
//        MovementController mc = new MovementController();
//        if(mc.moveEast(SaveTheCity.getGame()) == false) {
//            System.out.println("You cannot move there");
//        }
    }

    private void moveSouth() {
//        MovementController mc = new MovementController();
//        if(mc.moveSouth(SaveTheCity.getGame()) == false) {
//            System.out.println("You cannot move there");
//        }
    }

    private void moveWest() {
//        MovementController mc = new MovementController();
//        if(mc.moveWest(SaveTheCity.getGame()) == false) {
//            System.out.println("You cannot move there");
//        }
    }

    private void viewMap() {
//        System.out.println(SaveTheCity.getGame().getMap().getMapString());
    }
    
    private void viewCurrentLocation() {
        Location l = StarWars.getGame().getPlayer().getLocation();
        System.out.println("You are at: (" + l.getRow() + ", " + l.getCol() + ")");
    }

    private void viewHealth(int h) {
        int Health h = StarWars.getGame() .getPlayer().getHealth();
        System.out.println("Your current health: (" + h + ")");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
