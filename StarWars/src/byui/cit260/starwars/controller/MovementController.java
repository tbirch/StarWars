/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.controller;

import byu.cit260.starwars.exceptions.MovementControlException;
import byui.cit260.starwars.model.Game;
import byui.cit260.starwars.model.Location;
import byui.cit260.starwars.model.Map;
import byui.cit260.starwars.model.Player;

/**
 *
 * @author Daniel
 */
public class MovementController {
    
    public boolean moveNorth(Game game) throws MovementControlException {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0) {
            throw new MovementControlException("Cannot move the player off the map");
        }
        
        int currentCol = currentLocation.getCol();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        return true;
    }
    
    public boolean moveEast(Game game)throws MovementControlException {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == Map.NUM_COLS - 1) {
            throw new MovementControlException("Cannot move the player off the map");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() + 1));
        
        return true;
    }
    
    public boolean moveSouth(Game game)throws MovementControlException {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == Map.NUM_ROWS - 1) {
            throw new MovementControlException("Cannot move the player off the map");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getCol()));
        
        return true;
    }
    
    public boolean moveWest(Game game)throws MovementControlException {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == 0) {
            throw new MovementControlException("Cannot move the player off the map");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() - 1));
        
        return true;
    }
}
