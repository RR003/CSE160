package week8;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle( 1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle);

    }
}
