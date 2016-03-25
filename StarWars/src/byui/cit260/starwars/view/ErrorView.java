/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.view;

import java.io.PrintWriter;
import starwars.StarWars;

/**
 *
 * @author Taylor
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = StarWars.getOutFile();
    private static final PrintWriter logFile = StarWars.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
            "------------------------------------"
            + "\n- Error -" + errorMessage
            + "\n-----------------------------------");
        //Log error
        logFile.println(className + " - " + errorMessage);
    }
}
