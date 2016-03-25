/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import byui.cit260.starwars.model.Game;
import byui.cit260.starwars.model.Player;
import byui.cit260.starwars.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Jason
 */
public class StarWars {

    private static Player player;
    private static Game game;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            StarWars.inFile = new BufferedReader(new InputStreamReader(System.in));
            StarWars.outFile = new PrintWriter(System.out, true);
            StartProgramView start = new StartProgramView();
            start.startProgram();
            return;
        } catch (Throwable e) {
            System.out.println("Exveption: " + e.toString() + "\nCause: " + e.getCause() + "\nMessage: " + e.getMessage());
        } finally {
            try {
                if (StarWars.inFile != null) {
                    StarWars.inFile.close();
                }
                if (StarWars.outFile != null) {
                    StarWars.outFile.close();
                
            if (StarWars.logFile != null)
                StarWars.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error clossing files");
            }
        }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        StarWars.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        StarWars.inFile = inFile;
    }
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        StarWars.logFile = logFile;
    }

    public static void setCurrentGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
