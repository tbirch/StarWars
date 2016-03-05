/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.controller;

/**
 *
 * @author Jason
 */
public class MovementController {
  
    public double pythagorean(double sideA, double sideB, double sideC) {
        
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return -1;
        }
        double hypotenuse = sideA * sideA + sideB * sideB;
        Math.sqrt(hypotenuse);
        return hypotenuse;
    }
}
