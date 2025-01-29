package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Start Amount: ");
		int startAmount = in.nextInt();
		System.out.print("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.print("Win Limit: ");
		int winLimit = in.nextInt();
		System.out.print("Total Simulations: ");
		int totalSimulations = in.nextInt();
		int wins = 0;
		int losses = 0;
		
	
		for (int i = 1; i <= totalSimulations; i++) {
			int currentAmount = startAmount;
			while (currentAmount > 0 && currentAmount < winLimit) {
				double random = Math.random();
				if (random < winChance) {
					currentAmount++;
				} else {
					currentAmount--;
				}
			}
			if (currentAmount == 0) {
				System.out.println("Simulation " + i + ": LOSE");
				losses++;
			} else {
				System.out.println("Simulation " + i + ": WIN" );
				wins++;
			}
			
		}
		System.out.println("Ruin rate from sim: " + (double) losses/totalSimulations);

	}

}
