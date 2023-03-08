package CommandLine;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static ArrayList<Integer> arrayBankStanding = new ArrayList<Integer>();

	public static int firstRoll() {
		Random random = new Random();
		int randomNumber = random.nextInt(1, 11);
		Bank.arrayBankStanding.add(randomNumber);
		return randomNumber;
	}

	public static int roll() {
		Random random = new Random();
		int num = random.nextInt(1, 11);
		arrayBankStanding.add(num);
		return num;
	}

	public static int standing() {
		int sum = 0;
		for (int j : arrayBankStanding) {
			sum = sum + j;
		}
		return sum;
	}

	public static void resetStanding() {
		arrayBankStanding.clear();
	}
}
