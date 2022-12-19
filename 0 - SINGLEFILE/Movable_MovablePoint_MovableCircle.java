interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveRight();
    public void moveLeft();
}

class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x      = x;
        this.y      = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "(" + x + ", " + y + ", " + xSpeed + ", " + ySpeed + ")";
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

class MovableCircle implements Movable {
    private int          radius;
    private MovablePoint center;

    public MovableCircle(MovablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public String toString() {
        return "(" + center.x + ", " + center.y + ", "
        + center.xSpeed + ", " + center.ySpeed + ", " + radius + ")";
    }
    public void moveUp() {
        center.y = center.y - center.ySpeed;
    }
    public void moveDown() {
        center.y = center.y + center.ySpeed;
    }
    public void moveLeft() {
        center.x = center.x - center.xSpeed;
    }
    public void moveRight() {
        center.x = center.x + center.xSpeed;
    }
}
public class Movable_MovablePoint_MovableCircle {
    public static void main(String[] args) {
        MovablePoint  movablepoint1  = new MovablePoint(10, 5, 3, 2);
        MovableCircle movablecircle1 = new MovableCircle(movablepoint1, 4);
        System.out.println(movablepoint1.toString());
        System.out.println(movablecircle1.toString()); 
        System.out.println("");

        movablecircle1.moveUp();
        System.out.println(movablecircle1.toString());

        movablecircle1.moveDown();
        System.out.println(movablecircle1.toString());
    }
}