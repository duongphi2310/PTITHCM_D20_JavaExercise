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
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LineSub {
    private Point begin;
    private Point end;

    public LineSub(double beginX, double beginY, double endX, double endY) {
        begin = new Point(beginX, beginY);
        end   = new Point(endX  , endY);
    }
    public LineSub(Point begin, Point end) {
        this.begin = begin;
        this.end   = end;
    }
    public String toString() {
        return "Begin: " + begin + "\nEnd:   " + end;
    }
    public Point getBegin() {
        return begin;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public double getLength() {
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
        System.out.print("Length: ");
        return Math.round(Math.sqrt(xDiff * xDiff + yDiff * yDiff) * 100.0) / 100.0;
    }
}
public class Point_LineSub {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(6, 7);
        LineSub linesub = new LineSub(point1, point2);
        System.out.println(linesub);
        System.out.println(linesub.getLength());

        System.out.println("");

        LineSub linesub2 = new LineSub(3, 4, 5, 6);
        System.out.println(linesub2);
        System.out.println(linesub2.getLength());
    }
}