public class Circle {
    private double myX;
    private double myY;
    private double myDiameter;

    public Circle() {
        this.myX = 0;
        this.myY = 0;
        this.myDiameter = 100;
    }

   
    public Circle(double myX, double myY, double myDiameter) throws NegativeDiameterException {
        this.myX = myX;
        this.myY = myY;
        setMyDiameter(myDiameter); 
    }

    
    public double getMyX() {
        return myX;
    }

    public double getMyY() {
        return myY;
    }

    public double getMyDiameter() {
        return myDiameter;
    }

    
    public void setMyDiameter(double myDiameter) throws NegativeDiameterException {
        if (myDiameter < 0) {
            throw new NegativeDiameterException("Diameter cannot be negative.");
        }
        this.myDiameter = myDiameter;
    }

    
    @Override
    public String toString() {
        return "Circle [Center = (" + myX + ", " + myY + "), Diameter = " + myDiameter + "]";
    }
}
