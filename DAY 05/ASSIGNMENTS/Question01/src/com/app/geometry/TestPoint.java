package com.app.geometry;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x and y coordinates for Point 1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        Point2D p1 = new Point2D(x1, y1);

       
        System.out.print("Enter x and y coordinates for Point 2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

       
        Point2D p2 = new Point2D(x2, y2);

        
        System.out.println("Point 1 Details: " + p1.getDetails());
        System.out.println("Point 2 Details: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same position.");
        } else {
            System.out.println("The points are different.");

            
            System.out.println("Distance between the points: " + p1.calculateDistance(p2));
        }

        sc.close();
    }
}
