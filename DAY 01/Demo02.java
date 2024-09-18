import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("=======Calculating Area of Rectangle=======");
        int length, breadth, result;
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter the length  :");
        length = getInput.nextInt();
        System.out.print("Enter the breadth :");
        breadth = getInput.nextInt();

        result = length * breadth;
        System.out.println("Area of Rectangle :" + result);

    }
}
