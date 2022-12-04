public class Circle extends Shape {
    protected double radius;

    public Circle() {

    }
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
        double s = Math.round(Math.PI  * this.radius * this.radius * 100.0) / 100.0;
        return s;
    }
    public double getPerimeter() {
        double ss = Math.round(Math.PI * 2 * this.radius * 100.0) / 100.0;
        return ss;
    }
    public String toString() {
        return this.radius + " - " + this.color + " - " + this.filled;
    }
}
