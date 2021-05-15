package hw5;

public abstract class GeometricObject implements Cloneable, Comparable {
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

    public static GeometricObject max(Object o1, Object o2) throws ClassCastException{
        if (o1 instanceof GeometricObject && o2 instanceof GeometricObject)  {
            if (((GeometricObject)o1).getArea() <= ((GeometricObject)o2).getArea()) return (GeometricObject)o2;
            return (GeometricObject)o2;
        }
        throw new ClassCastException();
    }
    /** Abstract method getArea */
    public abstract double getArea();
    /** Abstract method getPerimeter */
    public abstract double getPerimeter();

    public Object clone() {
        try {
            return super.clone();
        }catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        /*hw5.GeometricObject rect1 = new hw5.Rectangle(2,3);
        hw5.GeometricObject rect2 = new hw5.Rectangle(4,5, "blue", true);

        hw5.GeometricObject circle1 = new hw5.Circle(5);
        hw5.GeometricObject circle2 = new hw5.Circle(3 ,"red", false);

        System.out.println(max(rect1, rect2));
        System.out.println(max(circle1, circle2));

        hw5.GeometricObject rect3 = (hw5.GeometricObject)rect1.clone();
        System.out.println(rect3);*/
    }
}

class Rectangle extends GeometricObject {

    private double height = 1.0;
    private double width = 1.0;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height * 2) + (this.width * 2);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "shape: rectangle, area: " + getArea() + " " + super.toString();
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(getArea(), ((Rectangle)o).getArea());
    }


}

class Circle extends GeometricObject {
    private double radius = 1.0;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "shape: circle, area: " + getArea() + " " + super.toString();
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(getArea(), ((Circle)o).getArea());
    }

}
