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
public class LightsaberController {
    public double coneVolume(double radius, double height) {
        
        if (radius <= 0 || height <= 0) {
            return -1;
        }
        double volume = Math.PI * radius *radius * (height/3);
        
        return volume;
    }
}
