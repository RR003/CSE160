package hw5;

import hw5.Circle;
import hw5.GeometricObject;
import hw5.Rectangle;

public class MaxTest {
    public static void main(String[] args) {
        GeometricObject rect1 = new Rectangle(2,3);
        GeometricObject rect2 = new Rectangle(4,5, "blue", true);

        GeometricObject circle1 = new Circle(5);
        GeometricObject circle2 = new Circle(3 ,"red", false);

        System.out.println(GeometricObject.max(rect1, rect2));
        System.out.println(GeometricObject.max(circle1, circle2));
    }
}
