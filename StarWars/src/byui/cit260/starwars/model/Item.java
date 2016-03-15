/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.model;

import java.util.Objects;

/**
 *
 * @author Taylor
 */
public class Item {

    private String name;
    private String color;
    private String healthIncrease;
    private String attackDamageIncrease;
 
public static Item[] createItemList(Item[] ItemList){ 
    //Created array list of Items
    Item[]item;
        item = new Item[3];
    Item LightSaber = new Item();
    LightSaber.setDescription("Light Saber");
    LightSaber.setColor("Green");
    LightSaber.sethealthIncrease(0);
    LightSaber.setattackDamageIncrease(10);
    
    Item Blaster = new Item();
    Blaster.setDescription("Blaster");
    Blaster.setColor("Red");
    Blaster.sethealthIncrease(0);
    Blaster.setattackDamageIncrease(10);
    
    Item Food = new Item();
    Food.setDescription("Food");
    Food.setColor("Brown");
    Food.sethealthIncrease(10);
    Food.setattackDamageIncrease(0);
    
    return ItemList;
}
    @Override
    public String toString() {
        return "Item{" + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return healthIncrease;
    }

    public void setSize(String size) {
        this.healthIncrease = size;
    }

    public String getPower() {
        return attackDamageIncrease;
    }

    public void setPower(String power) {
        this.attackDamageIncrease = power;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.color);
        hash = 29 * hash + Objects.hashCode(this.healthIncrease);
        hash = 29 * hash + Objects.hashCode(this.attackDamageIncrease);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.healthIncrease, other.healthIncrease)) {
            return false;
        }
        if (!Objects.equals(this.attackDamageIncrease, other.attackDamageIncrease)) {
            return false;
        }
        return true;
    }

    private void setDescription(String light_Saber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private void sethealthIncrease(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setattackDamageIncrease(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
