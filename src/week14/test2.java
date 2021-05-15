package week14;

public class test2 {
    public static void main(String[] args) {
        GeometricObject[] array = {new Circle(4), new Square(3), new Circle(2), new Square(5)};
        for (GeometricObject object : array) {
            if (object instanceof Colorable) {
                ((Colorable)object).howToColor();
            }
        }
    }
}

interface Colorable {
    void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public double getPerimeter() {
        return 4 * side;
    }


    public void howToColor() {
        System.out.println("fill in all sides with a solid color with an area of " + getArea());
    }
}

class Circle extends GeometricObject {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius *radius;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public java.util.Date getDateCreated() { return dateCreated; }

    public String toString() {
        return "color: " + getColor() +
                " and filled: " + isFilled();
    }
    /** Abstract method getArea */
    public abstract double getArea();
    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}