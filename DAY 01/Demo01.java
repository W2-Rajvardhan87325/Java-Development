public class Demo01 {
    public static void main(String[] args) {
        System.out.println("First Main Method");
        Demo01.main(10, 20);
    }

    public static void main(int a, int b) {
        System.out.println("Calling the Main Method with 2 arguments");
    }
}