package thuchanh_Geometry;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(30.5, 22.5, "black", true);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        System.out.println(rect.toString());
    }
}
