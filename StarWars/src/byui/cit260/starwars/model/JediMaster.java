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
public class JediMaster implements Serializable{
    
    private String name;
    private String forcePower;

    public JediMaster(String name, String forcePower) {
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

    @Override
    public String toString() {
        return "JediMaster{" + "name=" + name + ", forcePower=" + forcePower + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.forcePower);
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
        final JediMaster other = (JediMaster) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.forcePower, other.forcePower)) {
            return false;
        }
        return true;
    }
    
    
    
}
