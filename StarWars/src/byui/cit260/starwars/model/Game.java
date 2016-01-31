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
public class Game implements Serializable{
    private String save;
    private String load;
    private String newgame;

    public Game(String save, String load, String newgame) {
        this.save = save;
        this.load = load;
        this.newgame = newgame;
    }

    
    public String getNewgame() {
        return newgame;
    }

    public void setNewgame(String newgame) {
        this.newgame = newgame;
    }
    

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Game{" + "save=" + save + ", load=" + load + ", newgame=" + newgame + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.save);
        hash = 79 * hash + Objects.hashCode(this.load);
        hash = 79 * hash + Objects.hashCode(this.newgame);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.save, other.save)) {
            return false;
        }
        if (!Objects.equals(this.load, other.load)) {
            return false;
        }
        if (!Objects.equals(this.newgame, other.newgame)) {
            return false;
        }
        return true;
    }

    
    
    
}
