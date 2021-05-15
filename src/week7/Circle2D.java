package week7;

public class Circle2D {
    private double x = 0;
    private double y = 0;
    private double radius = 1;

    public Circle2D() {}

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * 3.1415;
    }

    public double getPerimeter() {
        return radius * 2 * 3.1415;
    }

    public boolean contains(double x, double y) {
        if (x >= 0) {
            if (x > radius + this.x) return false;
        }else {
            if (x < this.x - radius) return false;
        }

        if (y >= 0) {
            if (y > this.y + radius) return false;
        }else {
            if (y < this.y - radius) return false;
        }

        return true;
    }

    public boolean contains(Circle2D circle) {
        if (circle.radius > this.radius) return false;

        if (!this.contains(circle.x, circle.y)) return false;

        if (circle.x >= this.x) {
            if (this.x + this.radius < circle.x + circle.radius) return false;
        }else {
            if (this.x - this.radius > circle.x - circle.radius) return false;
        }

        if (circle.y >= this.y) {
            if (this.y + this.radius < circle.y + circle.radius) return false;
        }else {
            if (this.y - this.radius > circle.y - circle.radius) return false;
        }

        return true;
    }

    public boolean overlaps(Circle2D circle) {
        if (this.contains(circle)) return true;

        if (circle.x >= this.x) {
            if (circle.x - circle.radius > this.x + this.radius) return false;
        }else {
            if (circle.x - circle.radius < this.x - this.radius) return false;
        }

        if (circle.y >= this.y) {
            if (circle.y >= this.y) {
                if (circle.y - circle.radius > this.y + this.radius) return false;
            }else {
                if (circle.y - circle.radius < this.y - this.radius) return false;
            }
        }

        return true;
    }
}
