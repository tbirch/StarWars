/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Jason
 */
public class Enemy implements Serializable{
    
    private static final int MAX_HP = 75;
    private static final int MIN_HP = 50;
    private static final int MAX_DAMAGE = 25;
    
    private String name;
    private int health;
    private int attackDamage;
    private String forcePower;

    public Enemy() {
        Random random = new Random();
        health = random.nextInt(MAX_HP - MIN_HP) + MIN_HP;
        attackDamage = random.nextInt(MAX_DAMAGE);
    }
    
    public Enemy(String name, String forcePower) {
        this.name = name;
        this.forcePower = forcePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForcePower() {
        return forcePower;
    }

    public void setForcePower(String forcePower) {
        this.forcePower = forcePower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    
    @Override
    public String toString() {
        return "Boss{" + "name=" + name + ", forcePower=" + forcePower + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.forcePower);
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
        final Enemy other = (Enemy) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.forcePower, other.forcePower)) {
            return false;
        }
        return true;
    }
    
    
    
}
