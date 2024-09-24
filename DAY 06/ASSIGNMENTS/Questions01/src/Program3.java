import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count words: ");
        String input = sc.nextLine();

        // Trim spaces and split by spaces
        String[] words = input.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
        sc.close();
    }
}
