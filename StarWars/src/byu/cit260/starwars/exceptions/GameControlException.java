/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.starwars.exceptions;

/**
 *
 * @author Taylor
 */
public class GameControlException extends Exception {

    private String message;

    public GameControlException() {
        this.message = "Run time error, please reset the game";
    }

    public GameControlException(String message) {
        super(message);
        this.message = "Run time error, please reset the game"; 
       
    }

    public GameControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameControlException(Throwable cause) {
        super(cause);
    }

    public GameControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    
   
    
}
