public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x      = x;
        this.y      = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "MovablePoint: {x = " + x + ", y = " + y + ", xSPEED = " + xSpeed + ", ySPEED = " + ySpeed + "}.";
    }
    public void moveUp() {
        this.x = this.x + this.xSpeed;
    }
    public void moveDown() {
        this.x = this.x - this.xSpeed;
    }
    public void moveLeft() {
        this.y = this.y - this.ySpeed;
    }
    public void moveRight() {
        this.y = this.y + this.ySpeed;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed() {
        this.xSpeed = xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }
    public void setySpeed() {
        this.ySpeed = ySpeed;
    }
}