interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() {
        this.y = this.y - this.ySpeed;
    }
    public void moveDown() {
        this.y = this.y + this.ySpeed;
    }
    public void moveLeft() {
        this.x = this.x - this.xSpeed;
    }
    public void moveRight() {
        this.x = this.x + this.xSpeed;
    }
 }
 class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft     = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public void moveUp() {
        topLeft.y     = topLeft.y     - topLeft.ySpeed;
        bottomRight.y = bottomRight.y - bottomRight.ySpeed;
    }
    public void moveDown() {
        topLeft.y     = topLeft.y     + topLeft.ySpeed;
        bottomRight.y = bottomRight.y + bottomRight.ySpeed;
    }
    public void moveLeft() {
        topLeft.x     = topLeft.x     - topLeft.xSpeed;
        bottomRight.x = bottomRight.x - bottomRight.xSpeed;
    }
    public void moveRight() {
        topLeft.x     = topLeft.x     + topLeft.xSpeed;
        bottomRight.x = bottomRight.x + bottomRight.xSpeed;
    }
    public String toString() {
        return "(" + topLeft.x + ", " + topLeft.y + "); ("
        + bottomRight.x + ", " + bottomRight.y + ")";
    }
 }

public class Movable_MovablePoint_MovableRectangle {
    public static void main(String[] args) {
        Movable m1 = new MovableRectangle(20, 40, 120, 240, 5, 8);
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        System.out.println("");

        Movable m2 = new MovableRectangle(20, 40, 120, 140, 5, 8);
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
        System.out.println("");

        Movable m3 = new MovableRectangle(40, 60, 120, 140, 5, 8);
        System.out.println(m3);
        m3.moveLeft();
        System.out.println(m3);
        System.out.println("");

        Movable m4 = new MovableRectangle(40, 60, 120, 140, 5, 8);
        System.out.println(m4);
        m4.moveRight();
        System.out.println(m4);
        System.out.println("");
    }
}