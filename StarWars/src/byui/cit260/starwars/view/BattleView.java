/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starwars.view;

import byui.cit260.starwars.model.Enemy;
import byui.cit260.starwars.model.Player;
import java.util.Random;
import starwars.StarWars;

/**
 *
 * @author Daniel
 */
public class BattleView extends View {

    private Enemy enemy;
    private Player player;

    @Override
    public void display() {
        init();
        System.out.println("/t# " + enemy.getName() + " appeared! #\n");
        optionDisplay();
    }

    private void init() {
        enemy = StarWars.getGame().getPlayer().getLocation().getEnemy();
        player = StarWars.getGame().getPlayer();
    }

    public void optionDisplay() {

        boolean done = false;
        do {
            System.out.println("\tYour Health: " + player.getHealth());
            System.out.println("\t" + enemy.getName() + "'s Health: " + enemy.getHealth());
            System.out.println("\n\tWhat would you like to do?");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Meditate to gather strength");
            System.out.println("\t3. Run!");

            String value = this.getInput();

            done = this.doAction(value);
        } while (!done);

    }

    @Override
    public boolean doAction(String value) {

        switch (value.charAt(0)) {
            case '1':
                return attack();
            case '2':
                meditate();
                break;
            case '3':
                run();
                return true;
        }

        return false;
    }

    private boolean attack() {
        Random random = new Random();
        int damageDealt = random.nextInt(player.getMaxDamage() - Player.MIN_DAMAGE) + Player.MIN_DAMAGE;
        int damageTaken = random.nextInt(enemy.getAttackDamage());

        enemy.setHealth(enemy.getHealth() - damageDealt);
        player.setHealth(player.getHealth() - damageTaken);

        System.out.println("\t> You strike " + enemy.getName() + " for " + damageDealt + " damage.");
        System.out.println("\t> You receive " + damageTaken + " in retalliation!");

        if (player.getHealth() < 1) {
            System.out.println("\t> You have taken too much damage, you are too weak to go on!");
            return true;
        }
        if (enemy.getHealth() < 1) {
            StarWars.getGame().getPlayer().getLocation().setEnemy(null);
            System.out.println("\t> You defeated " + enemy.getName());
            return true;
        }

        return false;
    }

    private void meditate() {

    }

    private void run() {
        
        StarWars.getGame().getPlayer().setLocation(StarWars.getGame().getPlayer().getPreviousLocation());
        
    }

}
