package CommandLine;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		String anotherGame;

		do {

			// Clear the standings
			Player.resetStanding();
			Bank.resetStanding();

			// Get the Name from the Player ##
			System.out.println("Whats your name: ");
			Scanner tmp = new Scanner(System.in);
			String scanName = tmp.nextLine();
			Player player = new Player(scanName);
			// ##

			System.out.println("Welcome to BlackJack, " + Player.getPlayerName());

			// First Player Roll ##
			System.out.println("Your first Roll: " + Player.firstRoll());
			System.out.println("Your standing: " + Player.standing());
			// ##

			// First bank roll ##
			// System.out.println("The banks first Roll: " + Bank.firstRoll());
			// System.out.println("The banks standing: " + Bank.standing());
			Bank.firstRoll();
			// ##

			System.out.println("Do you want to pick another card? (y)/(n)");
			Scanner scanAnotherCard = new Scanner(System.in);
			String anotherCard = scanAnotherCard.nextLine();

			if (anotherCard.equals("y") || anotherCard.equals("Y")) {
				String anotherCard2 = null;
				do {
					if (Bank.standing() < 21 && Player.standing() < 21) {

						System.out.println("You rolled: " + Player.roll());
						System.out.println("Your standing: " + Player.standing());

						if (Player.standing() == 21) {
							System.out.println("You Won, you have exactly 21!");
							anotherCard2 = "";
							break;
						}

						if (Player.standing() > 21) {
							System.out.println("You Loose, you have more then 21!");
							anotherCard2 = "";
							break;
						}

						if (Bank.standing() == 21) {
							System.out.println("You Loose, the Bank has exactly 21!");
							break;
						}

						if (Bank.standing() > 21) {
							System.out.println("You Won, the bank has more then 21!");
							System.out.println("The banks standing: " + Bank.standing());
							break;
						}

						Bank.roll();
						Bank.standing();
						System.out.println("Do you want to pick another Card? (y)/(n)");
						// System.out.println("The bank rolled: " + Bank.roll());
						// System.out.println("The banks Standing: " + Bank.standing());

						if (Bank.standing() == 21) {
							System.out.println("You Loose, the Bank has exactly 21!");
							break;
						}

						if (Bank.standing() > 21) {
							System.out.println("You Won, the bank has more then 21!");
							System.out.println("The banks standing: " + Bank.standing());
							break;
						}

						Scanner scanAnotherCard2 = new Scanner(System.in);
						anotherCard2 = scanAnotherCard2.nextLine();
					}
				} while (anotherCard2.equals("y") || anotherCard2.equals("Y"));
			}

			if (Player.standing() < 21 && Bank.standing() < 21) {

				if (Player.standing() > Bank.standing()) {
					System.out.println("you Won!");
					System.out.println("Your standing: " + Player.standing());
					System.out.println("The banks standing: " + Bank.standing());

				} else {
					System.out.println("You Loose!");
					System.out.println("Your standing: " + Player.standing());
					System.out.println("The banks standing: " + Bank.standing());
				}
			}

			System.out.println("Do you want to play again? (y)/(n)");

			Scanner scanAnotherGame = new Scanner(System.in);
			anotherGame = scanAnotherGame.nextLine();

		} while (anotherGame.equals("y") || anotherGame.equals("Y"));
	}

}
