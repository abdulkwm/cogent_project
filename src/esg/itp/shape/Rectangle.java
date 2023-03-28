package esg.itp.shape;

public class Rectangle implements Polygon{
    private float length;
    private  float breadth;
    private float area;
    private float perimeter;
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calArea() {
        this.area = this.length * this.breadth;
    }

    public void calPeri() {
      this.perimeter = length * 2 + length * 2;
    }

    public void display() {
        System.out.println("Rectangle:");
        System.out.println("Area: " + this.area);
        System.out.println("Perimeter: " + this.perimeter);
    }

}
