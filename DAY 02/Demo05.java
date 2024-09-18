import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		Date birthDate = new Date();
		birthDate.acceptRecord();// birthDate.acceptRecord(birthDate)
		birthDate.printRecord(); // birthDate.printRecord(birthDate)

	}

}

class Date {
	private int day;
	private int month;
	private int year;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Day : ");
		this.day = sc.nextInt();

		System.out.print("Month : ");
		this.month = sc.nextInt();

		System.out.print("Year : ");
		this.year = sc.nextInt();

	}

	public void printRecord() {
		System.out.println(+day + " / " + month + " / " + year);
	}
}
