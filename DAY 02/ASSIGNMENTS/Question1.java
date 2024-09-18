
/*************************************
 * Author :: Rajvardhan Patil
 * Question ::Accept a integer number and when the program is executed print the
 * binary, octal and hexadecimal equivalent of the given number.
 *************************************/
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\t\tNumber Representation");
            System.out.print("Enter the integer number  ::");
            int number = sc.nextInt();

            System.out.println("\nGiven Number          ::" + number);
            System.out.println("Binary Representation ::" + Integer.toBinaryString(number));
            System.out.println("Octal Representation  ::" + Integer.toOctalString(number));
            System.out.println("HexaDecimal Rep       ::" + Integer.toHexString(number));

        }
    }

}
