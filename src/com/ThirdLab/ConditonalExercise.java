package com.ThirdLab;

import java.util.Scanner;

public class ConditonalExercise {

	private static Scanner scnr;

	public static void main(String[] args) {
		scnr = new Scanner(System.in);
		String usrName;
		int usrNum;
		boolean divCondition = true; // even is true odd is false

		// System.out.println("Enter your name");
		// usrName = scnr.toString();
		
		// necessary when going from a numeric type to String scan.nextLine()
		// scnr.nextInt();

		System.out.println("Enter an integer between 1 and 100");
		usrNum = scnr.nextInt();

		if (usrNum > 100) {
			System.out.println("Invalid Entry. Enter an integer between 1 and 100");
			usrNum = scnr.nextInt();
		}

		if ((usrNum % 2) == 0 && (usrNum <= 25)) {
			divCondition = true;
			System.out.println("Even and less than 25.");

		} else if ((usrNum % 2) != 0 && usrNum > 60) {
			divCondition = false;
			System.out.println("Odd and over 60.");
		}

		else if ((usrNum % 2) != 0 && usrNum < 60) {
			divCondition = false;
			System.out.println("Odd.");
		}
		else if (divCondition = true && usrNum <= 26) {
			System.out.println("Even and less than 25.");
		}

		else if (divCondition = true && usrNum < 60) {
			System.out.println("Even.");
		}

		else if (divCondition = true && usrNum > 60) {
			System.out.println("Even.");

		} else {

			System.out.println("Youre odd.");
		}
		
		scnr.close();

	}

}
