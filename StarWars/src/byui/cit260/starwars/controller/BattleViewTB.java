/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package byui.cit260.starwars.controller;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author birch
 */
public class BattleViewTB {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //System Objects
        Scanner in = new Scanner(System.in);
	Random rand = new Random();
        
        //Game variables
	String[] enemies = {"Sith Lord", "Darth Sidious", "Darth Mal", "Darth Vader", "Emperor Palpatine"};
	int maxEnemyHealth = 75;
	int enemyAttackDamage = 25;

	//Player variables
	int health = 100;
	int attackDamage = 50;
	int numMeditateMoments = 3;
	int meditateHealAmount = 30;
	int powerUpDropChance = 50; //Percentage chance an enemy drops a power up

	boolean running = true;
	
	System.out.println("Welcome to Star Wars Jedi Trainging!");

	Game:
        while (running) {

		System.out.println("------------------------------------");

		int enemyHealth = rand.nextInt(maxEnemyHealth);
		String enemy = enemies[rand.nextInt(enemies.length)];
		System.out.println("/t# " + enemy +" appeared! #\n");
		

		while (enemyHealth > 0) {
			System.out.println("\tYour Health: " + health);
			System.out.println("\t" + enemy +"'s Health: " + enemyHealth);
			System.out.println("\n\tWhat would you like to do?");
			System.out.println("\t1. Attack");
			System.out.println("\t2. Meditate to gather strength");
			System.out.println("\t3. Run!");

			String input = in.nextLine();
			if(input.equals("1")) {
				int damageDealt = rand.nextInt(attackDamage);
				int damageTaken = rand.nextInt(enemyAttackDamage);

				enemyHealth -= damageDealt;
				health -= damageTaken;

				System.out.println("\t> You strike " + enemy + " for " + damageDealt + " damage.");
				System.out.println("\t> You receive " + damageTaken + " in retalliation!");
				
				if(health < 1) {
			
					System.out.println("\t> You have taken too much damage, you are too weak to go on!");
					break;
					}
				}

			else if(input.equals("2")) {
				if(numMeditateMoments > 0){
					health += meditateHealAmount;
					numMeditateMoments--;
					System.out.println("\t> You mediate, healing yourself for " + meditateHealAmount + "."
								+ "\n\t> You now have " + health +" health"
								+ "\n\t> You have " + numMeditateMoments + " meditate moment(s) left.\n"); 
					}
					else {
						System.out.println("\t> You have no meditate moments left! Defeat enemies for a chance to gain one.");
						}

				}

			else if(input.equals("3")){
				System.out.println("\t> You run away from " + enemy + "!");
				continue Game;


				}
			
			else {
				System.out.println("\tInvalid command.");
				
				}

			}
			if(health < 1) {
				System.out.println("You return to ???, too weak to go on.");
				break;
				}
			System.out.println("-------------------------------------------");
			System.out.println(" # " + enemy + "was defeated! # ");
			System.out.println(" # You have " + health + " health left. #");
			if(rand.nextInt(100) < powerUpDropChance) {
				numMeditateMoments++;
				System.out.println(" # " + enemy + " dropped a power up! # ");
				System.out.println(" # You now have " + numMeditateMoments + " meditate moment(s). #");

				}
				System.out.println("-------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("1. Continue fighting");
				System.out.println("2. Exit");

				String input = in.nextLine();
				
				while(!input.equals("1") && !input.equals("2")) {
					System.out.println("Invalid command.");
					input = in.nextLine();


					} 

				if(input.equals("1")) {
					System.out.println("You continue on your training!");

					}
				else if(input.equals("2")) {
					System.out.println("Good Bye!");
					break;

					}
		}
		System.out.println("########################");
		System.out.println("## Thanks for Playing!##");
		System.out.println("########################");

    }
    
}