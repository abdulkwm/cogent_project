package esg.itp.shape;

public class Square implements Polygon{
    private float side;
    private float area;
    private float perimeter;
    public Square(float s){
        this.side = s;
    }
    public void calArea() {
        this.area = this.side * this.side;
    }

    public void calPeri() {
        this.perimeter = this.side * 4;
    }

    public void display() {
        System.out.println("Square:");
        System.out.println("Area: " + this.area);
        System.out.println("Perimeter: " + this.perimeter);
    }
}
