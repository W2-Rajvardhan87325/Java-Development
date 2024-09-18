import java.util.*;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println("====Taking Inputs and Displaying them (Scanner Bug)");
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the Roll Number :");
        int rollNumber = sc.nextInt();

        System.out.print("Enter the Name :");
        // sc.nextLine();
        String name = sc.next();

        System.out.print("Enter the Marks :");
        int marks = sc.nextInt();

        // Displaying Output
        System.out.println("Roll Number :" + rollNumber);
        System.out.println("Name        :" + name);
        System.out.println("Marks       :" + marks);

    }
}
