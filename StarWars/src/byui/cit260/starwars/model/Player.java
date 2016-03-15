/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jason
 */
public class Player implements Serializable{
    
    public static final int MIN_DAMAGE = 10;
    
    private String name;
    private Location location;
    private Location previousLocation;
    private int health;
    private int maxDamage;
    
    public Player() {
        health = 100;
        maxDamage = 25;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.previousLocation = this.location == null ? location : this.location;
        this.location = location;
    }

    public Location getPreviousLocation() {
        return previousLocation;
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        String Player = null;
        return Player;
    }
    
    
}
