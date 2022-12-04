public class Rectangle extends Shape {
    protected double width;
    protected double length;
    
    public Rectangle() {
        
    }
    public Rectangle(double width, double length) {
        this.width  = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super (color, filled);
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
        return this.length * this.width;
    }
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }
    public String toString() {
        return this.width + " - " +  this.length + " - " + this.color + " - " + this.filled;
    }
}