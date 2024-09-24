public class CircleTest {

    public static void main(String[] args) {
        try {
     
            Circle defaultCircle = new Circle();
            System.out.println("Default Circle: " + defaultCircle);

            
            Circle circle1 = new Circle(5.0, 7.0, 50.0);
            System.out.println("Circle 1: " + circle1);

            Circle invalidCircle = new Circle(3.0, 4.0, -25.0); 

        } catch (NegativeDiameterException e) {
            System.out.println(e.getMessage());
        }
    }
}
