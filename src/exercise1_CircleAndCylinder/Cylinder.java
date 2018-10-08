package exercise1_CircleAndCylinder;

public class Cylinder extends Circle {
    private double height = 10;

    public Cylinder() {
    }

    public Cylinder(double radius,double height, String color) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * height;
    }

    public double getAreaAll() {
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return "Một hình trự được tạo có bán kính = "
                +super.getRadius()+" và chiều cao = "
                +getHeight()+" có màu là "
                +super.getColor()+" là class con của "
                +super.toString();
    }
}
