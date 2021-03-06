/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.model;

import java.util.Arrays;

/**
 *
 * @author Taylor
 */
public class Map {
    
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    
    private Location [][] matrix;
    
    public Map(){
        matrix = new Location [NUM_ROWS][NUM_COLS];
}

public Location getLocation(int row, int col) {
    return matrix [row] [col];
}

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Arrays.deepHashCode(this.matrix);
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.matrix, other.matrix)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "matrix=" + matrix + '}';
    }
    
}
