import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, res;
		System.out.println("Enter First Number  :");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number :");
		num2 = sc.nextInt();
		String op;
		do {
			System.out.println("Enter the option +,-,*,/ or . to exit");
			op = sc.next();
			switch (op) {
				case "+":
					res = num1 + num2;
					System.out.println("Result " + res);
					break;
				case "-":
					res = num1 - num2;
					System.out.println("Result " + res);
					break;
				case "*":
					res = num1 * num2;
					System.out.println("Result " + res);
					break;
				case "/":
					res = num1 / num2;
					System.out.println("Result " + res);
					break;

				case ".":
					break;
				default:
					System.out.println("Invalid Input");
					continue;
			}

		} while (!op.equals("."));

	}

}
