
package Shape;

import esg.itp.shape.Rectangle;
import esg.itp.shape.Square;
public class ShapeApp {
    public static void main(String[] args) {
        Square square = new Square(23f);
        square.calArea();
        square.calPeri();
        square.display();
        Rectangle rectangle = new Rectangle(12f, 10f);
        rectangle.calArea();
        rectangle.calPeri();
        rectangle.display();
    }
}
