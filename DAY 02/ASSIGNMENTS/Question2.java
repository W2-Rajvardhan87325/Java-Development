
/*************************************
 * Author :: Rajvardhan Patil
 * Question :: Accept 2 double values from User (using Scanner). Check data
 * type. If arguments are not doubles, supply suitable error message
 * &terminate.If numbers are double values, print its average.
 *************************************/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
    public static double averageDouble(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static void main(String[] args) {
        double number1 = 0;
        double number2 = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st Double value ::");
            number1 = sc.nextDouble();
            System.out.print("Enter the 2nd Double value ::");
            number2 = sc.nextDouble();
            System.out.println("Average of Doubles ::" + averageDouble(number1, number2));
        } catch (InputMismatchException inp) {
            System.err.println("Invalid Input...!(Code Terminated)");
            System.exit(0);

        }
    }
}
