package shapes;

public class Square extends Rectangle implements Shape {
	
	// Lambda Expression for collecting area of Square
	private Area area = () -> getHeight() * getWidth();
	
    public Square(double width, double height) throws Exception {
        super(width,height);
    }

    @Override
    public String toString() {
        return "Square {s=" + super.getWidth() + "} perimeter = " + (getPerimeter() >= 0.0001 ? String.format("%.5f",getPerimeter()) : String.format("%e%n",getPerimeter())) + ", area = " + area.getArea();
    }
}
