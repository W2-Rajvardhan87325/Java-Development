package com.rajvardhan;

import java.util.Scanner;
import com.calculations.*;

public class Program {
    static Scanner sc = new Scanner(System.in);

    public static int menuList() {
        System.out.println("\t\tCalculate Area and Perimeter of Shape");
        System.out.printf("1.Circle\n2.Rectangle\n3.Square\n4.Press 0 to EXIT.\n");
        System.out.print("Select your Shape(1|2|3):");
        return sc.nextInt();
    }

    public static void main(String[] args){
        boolean exit = true;
        do {
            Printable p = null;
            int choice = menuList();
            while (choice != 0) {
                switch (choice) {
                    case 1:
                        p = new Circle();
                        p.acceptRecord();
                        p.printRecord();
                        break;
                    case 2:
                        p = new Rectangle();
                        p.acceptRecord();
                        p.printRecord();
                        break;
                    case 3:
                        p = new Square();
                        p.acceptRecord();
                        p.printRecord();
                        break;
                    default:
                        throw new IllegalArgumentException("Unexpected value: " + choice);
                }
                break;
            }
            char loopControl;
            System.out.println("Do you want to continue !(y|n) ::");
            loopControl = sc.next().charAt(0);
            if (loopControl == 'n') {
            	System.out.println("Code Exited....!");
                exit = false;
            }
        } while (exit);
    }

}
