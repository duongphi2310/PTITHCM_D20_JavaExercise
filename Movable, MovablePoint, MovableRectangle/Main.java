public class Main {
    public static void main(String[] args)
    {
        Movable m1 = new MovableRectangle(20, 40, 120, 140, 5, 8);
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
    }
    
}