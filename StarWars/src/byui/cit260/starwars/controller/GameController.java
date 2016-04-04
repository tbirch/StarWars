/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.controller;

import byu.cit260.starwars.exceptions.GameControlException;
import byui.cit260.starwars.model.Enemy;
import byui.cit260.starwars.model.Game;
import byui.cit260.starwars.model.Map;
import byui.cit260.starwars.model.Player;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import starwars.StarWars;

/**
 *
 * @author Daniel
 */
public class GameController {

    private static Game game;
    
    public static Player createPlayer(String playerName) {
        
        if(playerName == null) {
            return null;
        }
        
        Player p = new Player();
        p.setName(playerName);
        return p;
    }

    public static void createNewGame(Player player) {
        
        Game g = new Game();
        g.setPlayer(player);
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        player.setLocation(gameMap.getLocation(0, 0));
        
        Enemy greedo = new Enemy();
        greedo.setName("Greedo");
        
        gameMap.getLocation(0, 1).setEnemy(greedo);
        
        StarWars.setGame(g);
    }

    public static void getSavedGame(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        
       // try (FileInputStream fips = new FileInputStream(filePath)){
       //     ObjectInputStream input = new ObjectStream(fips);
            
       //     game = (Game) input.readObject(); //read the game object from file
       // }
       // catch(Exception e) {
       //     throw new GameControlException(e.getMessage());
       // }
        //close the output file
        //StarWars.setCurrentGame(game);
    
    }
}
