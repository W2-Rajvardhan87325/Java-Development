package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basket size: ");
        int basketSize = sc.nextInt();
        Fruit[] basket = new Fruit[basketSize];
        int counter = 0;

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of all fresh fruits");
            System.out.println("6. Display tastes of all stale fruits");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Mango
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, and color of Mango: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Mango(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2: // Add Orange
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, and color of Orange: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Orange(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3: // Add Apple
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, and color of Apple: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Apple(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4: // Display names of all fruits
                    System.out.println("Fruits in the basket:");
                    for (Fruit fruit : basket) {
                        if (fruit != null) {
                            System.out.println(fruit.getName());
                        }
                    }
                    break;

                case 5: // Display details of all fresh fruits
                    System.out.println("Fresh fruits in the basket:");
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.isFresh()) {
                            System.out.println(fruit + ", Taste: " + fruit.taste());
                        }
                    }
                    break;

                case 6: // Display tastes of all stale fruits
                    System.out.println("Tastes of stale fruits:");
                    for (Fruit fruit : basket) {
                        if (fruit != null && !fruit.isFresh()) {
                            System.out.println(fruit.taste());
                        }
                    }
                    break;

                case 7: // Mark a fruit as stale
                    System.out.print("Enter index of the fruit to mark as stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println(basket[index].getName() + " marked as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 8: // Exit
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        sc.close();
    }
}
