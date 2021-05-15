package week7;

public class Circle2DDriver {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D();
        Circle2D c2 = new Circle2D(2,1,0.5);
        System.out.println(c1.contains(c2));
        System.out.println(c1.getArea());
        System.out.println(c1.overlaps(c2));
        System.out.println(c1.contains(3,1));
    }
}
