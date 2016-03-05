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
public class BattleController {
    
    public double prismArea(double sideA, double sideB, double sideC) {
        
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return -1;
        }
        double surfaceArea = 2 * sideA * sideB + 2 * sideB *sideC + 2 * sideA * sideC;
        return surfaceArea;
    }
}
