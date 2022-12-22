class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double  x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LineSub extends Point{
    private Point end;
    public LineSub(double beginX, double beginY, double endX, double endY) {
       super(beginX, beginY);
       this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end   = end;
    }
    public String toString() {
        return "Line: Begin: (" + super.getX() + ", " + super.getY()
                + "); (" + end.getX() + ", " + end.getY() + ").";
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public double getLength() {
        double xDiff = end.getX() - super.getX();
        double yDiff = end.getY() - super.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
public class Point_LineSub_Extends {
    public static void main(String[] args) {
        Point point1 = new Point(7, 3);
        Point point2 = new Point(6, 4);
        LineSub linesub1 = new LineSub(point1, point2);
        System.out.println(linesub1.toString());
        System.out.println(linesub1.getLength());
    }
}