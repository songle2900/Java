package shapes;

public class Parallelogram extends Rectangle implements Shape {

	// Lambda Expression for calucating area of Parallelogram
		// private Area area = () -> getWidth() * getHeight();
	
	public Parallelogram(double width, double height) throws Exception{
    	super(width,height);
    }

    @Override
    public String toString() {
        return "Parallelogram {w=" + super.getWidth() + ", h=" + super.getHeight() + "} perimeter = " + String.format("%.5f",getPerimeter());
    }
}
