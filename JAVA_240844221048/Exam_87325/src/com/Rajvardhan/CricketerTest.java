/*
Write a class Cricketer [name,gender,age,email_id,contact,rating,role]  (role can be either Batsman or Bowler ) Use enum
        This application should contains the Test class called CricketerTest which will
        test the functionality of cricketer class.

        Use any collection to perform following operation..

        1.Add Cricketer
        2.Remove Cricketer
        3.Modify Cricketer's role
        4.Search Cricketer by rating
        5.Sort Cricketer by name
        6.Display All Cricketer

        Write a menu driven program for above menu 

        Write a user defined exception class which will throw an Underrated exception when user enters negative value for rating and throws Overrated exception when user enters value greater than 5 for rating.

*/
package com.Rajvardhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CricketerTest {
	public static void main(String[] args) throws OverratedException, UnderratedException {
		Scanner sc = new Scanner(System.in);
		List<Cricketer> list = new ArrayList<>();

		boolean exit = false;
		while (!exit) {
			System.out.println("""
					===============MENU DRIVEN CODE===========
					1. ADD CRICKETER
					2. REMOVE CRICKETER
					3. MODIFY CRICKETER
					4. SEARCH CRICKETER (BY RATING)
					5. SORT BY NAME
					6. DISPLAY CRICKETER
					""");
			System.out.print("ENTER YOUR CHOICE :: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {

				case 1:
					try {
						System.out.println("===============ADDING CRICKETER===========");
						System.out.print("Enter the Cricketer Name   :: ");
						String tempName = sc.nextLine();
						System.out.print("Enter the Cricketer Gender :: ");
						String tempGender = sc.nextLine();
						System.out.print("Enter the Cricketer Email  :: ");
						String tempEmail = sc.nextLine();
						System.out.print("Enter the Cricketer Role (Batsman | Bowler) :: ");
						String tempRoll = sc.nextLine().toUpperCase();
						Roll cricketerRole = Roll.valueOf(tempRoll);
						System.out.print("Enter the Cricketer Age    :: ");
						int tempAge = sc.nextInt();
						System.out.print("Enter the Cricketer Contact:: ");
						long tempContact = sc.nextLong();
						System.out.print("Enter the Cricketer Rating :: ");
						int tempRating = sc.nextInt();

						Cricketer criObj = new Cricketer(tempName, tempGender, tempEmail, cricketerRole, tempAge,
								tempContact, tempRating);
						list.add(criObj);
						System.out.println("Data Added Successfully...!");
					} catch (IllegalArgumentException e) {
						System.out.println("Invalid Role. Please enter either 'Batsman' or 'Bowler'.");
					} catch (Exception e) {
						System.out.println("Invalid Input");
					}
					break;

				case 2:
					System.out.println("===============REMOVE CRICKETER===========");
					System.out.print("Enter the Cricketer Name (Remove) :: ");
					String searchName = sc.nextLine();
					Cricketer nameToRemove = new Cricketer();
					for (Cricketer name : list) {
						if (name.getName().equalsIgnoreCase(searchName)) {
							nameToRemove.setName(searchName);
							break;
						} else {
							System.out.println("Name not Found...!");
						}
					}
					if (list.remove(nameToRemove)) {
						System.out.println("Name removed successfully...!");
					}
					break;

				case 3:
					System.out.println("===============MODIFY CRICKETER ROLE===========");
					System.out.print("Enter the Cricketer Name (To Change Role) :: ");
					String changeName = sc.nextLine();
					Cricketer nameToSearch = new Cricketer();
					for (Cricketer name : list) {
						if (name.getName().equalsIgnoreCase(changeName)) {
							nameToSearch.setName(changeName);
							System.out.print("New Role (Batsman | Bowler) :: ");
							String newRoll = sc.nextLine().toUpperCase();
							Roll newCricketerRole = Roll.valueOf(newRoll); // Convert input to Roll enum
							nameToSearch.setRoll(newCricketerRole);
							System.out.println("Details Updated.....!");
							break;
						} else {
							System.out.println("Name not Found...!");
						}
					}
					break;

				case 4:
					System.out.println("===============SEARCH CRICKETER BY RATING===========");
					System.out.print("Enter the Cricketer Rating :: ");
					int searchRating = sc.nextInt();
					boolean found = false;
					for (Cricketer rating : list) {
						if (rating.getRating() == searchRating) {
							System.out.println(rating);
							found = true;
							break;
						}
					}
					if (!found) {
						System.out.println("No Cricketer Available for that Input.");
					}
					break;

				case 5:
					System.out.println("===============SORT===========");
					list.sort((x, y) -> x.getName().compareTo(y.getName()));
					for (Cricketer cricketer : list) {
						System.out.println(cricketer);
					}
					break;

				case 6:
					System.out.println("===============DISPLAY===========");
					for (Cricketer cricketer : list) {
						System.out.println(cricketer);
					}
					break;

				default:
					System.exit(0);
					break;
			}
		}
		// sc.close();
	}
}
