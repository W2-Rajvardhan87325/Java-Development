public class Demo04 {
    public static void main(String[] args) {
        System.out.println("\t\tImplict Typecasting || widening");
        int num1 = 10;
        double num2 = num1;
        System.out.println("Implict Value :" + num2);

        System.out.println("\t\tExplict Typecasting || narrowing");
        double num3 = 10.0;
        int num4 = (int) num3;
        System.out.println("Explict Value :" + num4);

    }
}
