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
    
    private String row;
    private String column;
    private String visited;
    private JediMaster jediMaster;
    private Boss boss;
    private Item item;

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public JediMaster getJediMaster() {
        return jediMaster;
    }

    public void setJediMaster(JediMaster jediMaster) {
        this.jediMaster = jediMaster;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
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
        hash = 97 * hash + Objects.hashCode(this.column);
        hash = 97 * hash + Objects.hashCode(this.visited);
        hash = 97 * hash + Objects.hashCode(this.jediMaster);
        hash = 97 * hash + Objects.hashCode(this.boss);
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
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", jediMaster=" + jediMaster + ", boss=" + boss + ", item=" + item + '}';
    }
    
    
}
