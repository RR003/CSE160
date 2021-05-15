package hw5;

public class CloneableTest {
    public static void main(String[] args) {
        GeometricObject rect1 = new Rectangle(3,4);
        GeometricObject rect2 = (Rectangle) rect1.clone();
    }
}
