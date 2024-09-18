import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Enter the course name: ");
        Scanner sc = new Scanner(System.in);
        String course = sc.next();
        switch (course) {
            case "DMC",
                    "dmc":
                System.out.print("Diploma in Mobile Computing");
                break;
            case "DAC",
                    "dac":
                System.out.print("Diploma in Advaced Computing");
                break;
            case "DBDA",
                    "dbda":
                System.out.print("Diploma in Big Data Analysis");
                break;

            default:
                System.out.print("Invalid Input");
                break;
        }
    }
}
