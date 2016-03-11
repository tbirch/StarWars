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
 * @author Taylor
 */
public class Location implements Serializable{
    
    
    private String visited;
    private JediMaster jediMaster;
    private Enemy enemy;
    private Item item;
    private int row;
    private int col;

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    public JediMaster getJediMaster() {
        return jediMaster;
    }

    public void setJediMaster(JediMaster jediMaster) {
        this.jediMaster = jediMaster;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.row);
        hash = 97 * hash + Objects.hashCode(this.visited);
        hash = 97 * hash + Objects.hashCode(this.jediMaster);
        hash = 97 * hash + Objects.hashCode(this.enemy);
        hash = 97 * hash + Objects.hashCode(this.item);
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
        final Location other = (Location) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Location{ visited=" + visited + ", jediMaster=" + jediMaster + ", boss=" + enemy + ", item=" + item + '}';
    }
    
    
}
