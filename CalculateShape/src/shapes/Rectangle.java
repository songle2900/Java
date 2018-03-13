package shapes;

public class Rectangle implements Shape {
    private double width;
    private double height;
    
	// Lambda Expression for collecting area of Rectangle
	private Area area = () -> getHeight() * getWidth();


    public Rectangle(double width, double height) throws Exception {
        if((width <= 0 || height <= 0) && (width != height) ){
            throw new Exception("Invalid side(s)!");
        }
        else if((width <= 0 || height <= 0) && (width == height)) {
            throw new Exception("Invalid side!");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter(){
        return 2*width + 2*height;
    }

    @Override
    public String toString() {
        return "Rectangle {w=" + width + ", h=" + height + "} perimeter = " + String.format("%.5f", getPerimeter()) + ", area = " + area.getArea();
    }
}
