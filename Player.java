package CommandLine;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player {

	private static String playerName;

	public static ArrayList<Integer> arrayPlayerStanding = new ArrayList<Integer>();

	public Player(String playerName) {
		this.playerName = playerName;
	}

	public static String getPlayerName() {
		return playerName;
	}

	public static int roll() {
		Random random = new Random();
		int num = random.nextInt(1, 11);
		// System.out.println("you rolled: "+num);
		arrayPlayerStanding.add(num);
		return num;
	}

	public static int firstRoll() {
		Random random = new Random();
		int randomNumber = random.nextInt(1, 11);
		Player.arrayPlayerStanding.add(randomNumber);
		// System.out.println("you rolled: "+randomNumber);
		return randomNumber;
	}

	public static int standing() {
		int sum = 0;
		for (int j : arrayPlayerStanding) {
			sum = sum + j;
		}
		return sum;
	}

	public static void resetStanding() {
		arrayPlayerStanding.clear();
	}

}
