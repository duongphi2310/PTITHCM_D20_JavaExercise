class Shape {
    private String  color;
    private boolean filled;

    public Shape() {
        this.color = "RED";
        this.filled = true;
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
    public String toString() {
        return "SHAPE: \nColor : " + color + "\nFilled: " + filled; 
    }
}
class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
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
        return Math.round(Math.PI * this.radius * this.radius * 100.0) / 100.0;
    }
    public double getPerimeter() {
        return Math.round(Math.PI * 2 * this.radius * 100.0) / 100.0;
    }
    public String toString() {
        return "CIRCLE: \nRadius: " + radius + "\n" + super.toString();
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width  = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width  = width;
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
        return this.width * this.length;
    }
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }
    public String toString() {
        return "RECTANGLE: \nWidth: " + width + "\nLength: " + length + "\n" +super.toString();
    }
}

class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return super.getWidth();
    }
    public double setSide (double side) {
        super.setWidth(side);
        super.setLength(side);
        return side;
    }
    public void setWidth(double side) {
        setSide(side);
    }
    public void setLength(double side) {
        setSide(side);
    }
    public String toString() {
        return "SQUARE: \n" + "Side: " + getSide() +  "\n" + super.toString();  
    }
}
public class Shape_Circle_Rectangle_Square_EXTENDS {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        System.out.println("");

        Shape shape2 = new Shape("BLUE", false);
        System.out.println(shape2);

        System.out.println("");

        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Area     : " + circle1.getArea());

        System.out.println("");

        Circle circle2 = new Circle(2.0);
        System.out.println(circle2);
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println("Area     : " + circle2.getArea());

        System.out.println("");

        Circle circle3 = new Circle(3.0, "GREEN", true);
        System.out.println(circle3);
        System.out.println("Perimeter: " + circle3.getPerimeter());
        System.out.println("Area     : " + circle3.getArea());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Area     : " + rectangle1.getArea());

        System.out.println("");

        Rectangle rectangle2 = new Rectangle(2, 3);
        System.out.println(rectangle2);
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Area     : " + rectangle2.getArea());

        System.out.println("");

        Rectangle rectangle3 = new Rectangle(4, 5, "BLACK", false);
        System.out.println(rectangle3);
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        System.out.println("Area     : " + rectangle3.getArea());

        System.out.println("");

        Square square1 = new Square();
        System.out.println(square1);
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println("Area     : " + square1.getArea());

        System.out.println("");

        Square square2 = new Square(5);
        System.out.println(square2);
        System.out.println("Perimeter: " + square2.getPerimeter());
        System.out.println("Area     : " + square2.getArea());

        System.out.println("");

        Square square3 = new Square(9, "PINK", true);
        System.out.println(square3);
        System.out.println("Perimeter: " + square3.getPerimeter());
        System.out.println("Area     : " + square3.getArea());
    }
}