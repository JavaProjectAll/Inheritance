package exercise1_CircleAndCylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(20, "red");
        System.out.println("Diện tich = "+circle.getArea());
        System.out.println(circle.toString());
        System.out.println();
        Cylinder cylinder = new Cylinder(20,40,"blue");
        System.out.println("Diện tích xung quanh hình trụ = "+cylinder.getArea());
        System.out.println("Diện tích toàn phần hình trụ = "+cylinder.getAreaAll());
        System.out.println(cylinder.toString());
    }
}
