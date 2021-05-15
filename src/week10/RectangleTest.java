package week10;

import week10.Rectangle;
import week10.Square;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,5);

        r.draw();



        Square s1 = new Square();

        s1.draw();
        Square s = new Square(3);

        s.draw();
    }
}
