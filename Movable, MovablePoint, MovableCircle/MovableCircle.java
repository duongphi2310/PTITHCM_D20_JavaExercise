public class MovableCircle implements Movable {
    private int          radius;
    private MovablePoint center;
    public MovableCircle(MovablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public String toString() {
        return "Center: (" + this.center.getX() + ", " + this.center.getY() + ").";
    }
    public void moveUp() {
        this.center.setX(this.center.getX() + this.center.getxSpeed());
    }
    public void moveDown() {
        this.center.setX(this.center.getX() - this.center.getxSpeed());
    }
    public void moveLeft() {
        this.center.setY(this.center.getY() - this.center.getySpeed());
    }
    public void moveRight() {
        this.center.setY(this.center.getY() + this.center.getySpeed());
    }
}