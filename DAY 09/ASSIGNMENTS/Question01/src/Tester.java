import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = null;  // For dynamic method dispatch
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push Data");
            System.out.println("4. Pop Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        if (stack == null) {
                            stack = new FixedStack();
                            System.out.println("Fixed Stack chosen.");
                        } else {
                            System.out.println("Stack already chosen.");
                        }
                        break;

                    case 2:
                        if (stack == null) {
                            stack = new GrowableStack();
                            System.out.println("Growable Stack chosen.");
                        } else {
                            System.out.println("Stack already chosen.");
                        }
                        break;

                    case 3:
                        if (stack == null) {
                            System.out.println("No stack chosen! Please choose a stack first.");
                        } else {
                            System.out.print("Enter Employee ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();  // Consume the newline character
                            System.out.print("Enter Employee Name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter Employee Salary: ");
                            double salary = sc.nextDouble();

                            Employee e = new Employee(id, name, salary);
                            stack.push(e);  // Push employee to the chosen stack
                        }
                        break;

                    case 4:
                        if (stack == null) {
                            System.out.println("No stack chosen! Please choose a stack first.");
                        } else {
                            Employee poppedEmployee = stack.pop();
                            if (poppedEmployee != null) {
                                System.out.println("Popped Employee: " + poppedEmployee);
                            }
                        }
                        break;

                    case 5:
                        exit = true;
                        System.out.println("Exiting the program.");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                sc.nextLine();  // Clear invalid input
            }
        }

        sc.close();
    }
}
