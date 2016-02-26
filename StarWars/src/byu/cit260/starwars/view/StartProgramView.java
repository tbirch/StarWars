/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.starwars.view;

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
                       + "* Put the StarWars game description here      *"
                       + ""
       );
    }
}
