package com.Rajvardhan;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter account number (or -1 to exit): ");
			int accountNumber = sc.nextInt();

			if (accountNumber == -1) {
				System.out.println("Exiting...");
				break;
			}

			System.out.println("Enter beginning balance: ");
			int beginningBalance = sc.nextInt();
			System.out.println("Enter total charges this month: ");
			int totalCharges = sc.nextInt();
			System.out.println("Enter total credits this month: ");
			int totalCredits = sc.nextInt();
			System.out.println("Enter credit limit: ");
			int creditLimit = sc.nextInt();

			int newBalance = beginningBalance + totalCharges - totalCredits;

			
			System.out.println("New balance: " + newBalance);

			
			if (newBalance > creditLimit) {
				System.out.println("Credit limit exceeded.");
			} else {
				System.out.println("Credit limit not exceeded.");
			}

			System.out.println(); 
		}

		
		sc.close();
	}

}
