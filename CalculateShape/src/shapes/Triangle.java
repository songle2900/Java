package shapes;

public class Triangle implements Shape {
    private  double s1;
    private  double s2;
    private  double s3;

  //Lambda Expression for calucating area of Triangle.
  // private Area area = () -> getS1() * getS2() * getS3();
    
    public Triangle(double s1, double s2, double s3) throws Exception{
        if(s1 <= 0 || s2 <= 0 || s3 <= 0 || s1 + s2 <= s3){
            throw new Exception("Invalid side(s)!");
        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getPerimeter(){
        return s1 + s2 + s3;
    }

    @Override
    public String toString() {
        return "Triangle {s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "} perimeter = " + String.format("%.5f",getPerimeter());
    }
}
