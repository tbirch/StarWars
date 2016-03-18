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
public class Throwable extends Exception {

    private String message;

    public Throwable() {
        this.message = "Run time error, please reset the game";
    }

    public Throwable(String message) {
        super(message);
        this.message = "Run time error, please reset the game";
    }

    public Throwable(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Throwable(java.lang.Throwable cause) {
        super(cause);
    }

    public Throwable(String message, java.lang.Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    
    
}
