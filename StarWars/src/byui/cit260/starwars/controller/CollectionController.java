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
public class CollectionController {
    
    public double calculateCylinderVolume(double radius, double height) {
        
        if (radius <= 0 || height <= 0) {
            return -1;
        }
        double volume = 3.14 * radius *radius * height;
        return volume;
    }
}
