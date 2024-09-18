package area;

public class Circle {

	   private double radius;
	   
	   public void calcAreaC(double r) {
		   this.radius=r;
	       double result=3.142 * this.radius * this.radius;
	       System.out.println("The Area of Circle :"+result);
	   }
}
