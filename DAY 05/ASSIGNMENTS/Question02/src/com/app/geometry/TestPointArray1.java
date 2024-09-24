package com.app.geometry;

import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of points to plot: ");
        int n = sc.nextInt();

      
        Point2D[] points = new Point2D[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x and y coordinates for point " + (i + 1) + ": ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point2D(x, y); 
        }

        boolean exit = false;

       
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display coordinates of all points");
            System.out.println("3. Display distance between two points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter the index of the point to display: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < points.length) {
                        System.out.println("Point " + (index + 1) + ": " + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!");
                    }
                    break;

                case 2: 
                    System.out.println("Displaying all points:");
                    for (Point2D point : points) {
                        System.out.println(point.getDetails());
                    }
                    break;

                case 3: 
                    System.out.print("Enter the index of the first point: ");
                    int index1 = sc.nextInt();
                    System.out.print("Enter the index of the second point: ");
                    int index2 = sc.nextInt();

                   
                    if (index1 >= 0 && index1 < points.length && index2 >= 0 && index2 < points.length) {
                        if (!points[index1].isEqual(points[index2])) {
                            System.out.println("Distance between Point " + (index1 + 1) + " and Point " + (index2 + 1) + " is: "
                                    + points[index1].calculateDistance(points[index2]));
                        } else {
                            System.out.println("Both points are at the same position.");
                        }
                    } else {
                        System.out.println("Invalid indices, please retry!");
                    }
                    break;

                case 4: // Exit
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        sc.close();
    }
}
