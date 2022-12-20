abstract class Shape {
    protected String  color;
    protected boolean filled;

    public Shape() {

    }
    public Shape(String color, boolean filled) {
        this.color  = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
class Circle extends Shape {
    private double radius;

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
        double s = Math.round(Math.PI * this.radius * this.radius * 100.0) / 100.0;
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

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {

    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width  = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        double sss = this.length * this.width;
        return sss;
    }
    public double getPerimeter() {
        double ssss = (this.length + this.width) * 2;
        return ssss;
    }
    public String toString() {
        return this.width + " - " + this.length + " - " + this.color + " - " + this.filled;
    }
}
class Square extends Rectangle {
    public Square() {

    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
}
public class Shape_Circle_Rectangle_Square {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", true);
        System.out.println (s1);
        System.out.println (s1.getArea());          
        System.out.println (s1.getPerimeter());     
        System.out.println (s1.getColor());
        System.out.println (s1.isFilled());
        System.out.println (((Circle) s1).getRadius());
        System.out.println ("");

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println ("");

        Shape s3 = new Rectangle(4.5, 7.5, "RED", true);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle) s3).getLength());
        System.out.println ("");

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println ("");

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getWidth());
        System.out.println ("");

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getWidth());
        System.out.println(r2.getLength());
        System.out.println ("");

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getWidth());
        System.out.println(sq1.getLength());
    }
}