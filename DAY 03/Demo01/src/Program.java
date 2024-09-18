import java.util.Scanner;
public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[][] = new int[4][4];
    System.out.println("\t\tArrays");
//    arr[0]=new int[4];
//    arr[1]=new int[2];
//    arr[2]=new int[4];
//    arr[3]=new int[2];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print("Enter the value at [" + i + "] [" + j + "] index: ");
        arr[i][j] = sc.nextInt();
      }
      System.out.println(); // Add a newline after each row
    }

    System.out.println("\t\tPrinting Array");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "\t"); // Print with tabs for spacing
      }
      System.out.println(); // Newline after each row
    }
    sc.close();
  }
}