
/*************************************
 * Author :: Rajvardhan Patil
 * Question :: Display food menu to user. User will select items from menu along
 * with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill )
 * Assign fixed prices to food items(hard code the prices) When user enters
 * 'Generate Bill'option , display total bill & exit.
 *************************************/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Dosa", 40);
        menu.put("Samosa", 20);
        menu.put("Idli", 40);
        System.out.println("\t\tWel-come to Raj Dhabha");
        System.out.println("Printing the menu ::");
        int index = 1;
        for (String item : menu.keySet()) {
            System.out.println(index + ". " + item + " ----- Rs. " + menu.get(item));
            index++;
        }
        System.out.println(index + ". Generate Bill");

        double totalBill = 0;
        boolean generatingBill = false;
        while (!generatingBill) {
            System.out.print("\nEnter you choice (or press 4 submit Order and Generate Bill) ::");
            int choice = sc.nextInt();

            if (choice == index) {
                generatingBill = true;
                System.out.println("=========Generating Bill==========");
                System.out.println("Total Bill ::" + totalBill);
            } else if (choice > 0 && choice < index) {
                String selectedItem = (String) menu.keySet().toArray()[choice - 1];
                int price = menu.get(selectedItem);
                System.out.print("Enter quantity for " + selectedItem + ": ");
                int quantity = sc.nextInt();
                int cost = price * quantity;
                totalBill += cost;
                System.out.println(quantity + " x " + selectedItem + " added to bill. Cost: Rs. " + cost);
            }
        }
        System.out.println("Thank you for your purchase!");
        sc.close();
    }

}
