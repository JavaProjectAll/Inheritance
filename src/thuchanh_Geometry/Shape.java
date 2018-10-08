package thuchanh_Geometry;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor() + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
