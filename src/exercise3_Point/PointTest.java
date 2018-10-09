package exercise3_Point;

public class PointTest {
    public static void main(String[] args) {
        MovablePoint move = new MovablePoint(10.5f, 12f, 20.5f, 15.5f);
        System.out.println("Speed (" + move.getXSpeed() + " - " + move.getYSpeed() + ")");
        System.out.println(move.move());
    }
}
