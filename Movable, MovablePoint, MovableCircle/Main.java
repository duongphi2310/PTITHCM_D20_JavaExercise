public class Main {
    public static void main(String[] args) {
        MovablePoint  movablePoint  = new MovablePoint(10, 5, 3,2);
        MovableCircle movableCircle = new MovableCircle(movablePoint, 4);
        System.out.println(movablePoint.toString());
        System.out.println(movableCircle.toString());
        System.out.println("");
        
        movableCircle.moveRight();
        System.out.println(movableCircle.toString());
        
        movableCircle.moveUp();
        System.out.println(movableCircle.toString());
        
        movableCircle.moveLeft();
        System.out.println(movableCircle.toString());
        
        movableCircle.moveDown();
        System.out.println(movableCircle.toString());
    }
}