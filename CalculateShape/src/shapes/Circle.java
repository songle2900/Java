package shapes;

public class Circle implements Shape {
    private double r;

	// Lambda Expression for collecting area of Circle
	private Area area = () -> Math.PI * r * r;
    
    public Circle(double r) throws Exception{
        if(r <= 0) {
            throw new Exception("Invalid radius!");
        }
        this.r = r;
    }
    
    // Get radius
    public double getR() {
        return r;
    }
    
    // Set radius
    public void setR(double r) {
        this.r = r;
    }

    public double getPerimeter(){
       return (2*Math.PI*r);
    }

    @Override
    public String toString() {
        return "Circle {" + "r=" + r + "} " + "perimeter = " + String.format("%.5f",getPerimeter()) + ", area = " + area.getArea();
    }
}
