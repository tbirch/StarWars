/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import byui.cit260.starwars.model.Game;
import byui.cit260.starwars.model.Player;
import byui.cit260.starwars.view.StartProgramView;

/**
 *
 * @author Jason
 */
public class StarWars {

    private static Player player;
    private static Game game;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView start = new StartProgramView();
        start.startProgram();
        
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StarWars.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        StarWars.game = game;
    }
    
}
