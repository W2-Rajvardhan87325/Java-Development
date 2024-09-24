import java.util.Scanner;

public class StringLengthCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        try {
            checkStringLength(input);
            System.out.println("The string is accepted: " + input);
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void checkStringLength(String str) throws ExceptionLineTooLong {
        if (str.length() > 80) {
            throw new ExceptionLineTooLong("The string is too long.");
        }
    }
}
