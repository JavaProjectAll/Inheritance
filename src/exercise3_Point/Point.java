package exercise3_Point;

public class Point {
    private float x = 1.0f;
    private float y = 1.0f;
    private float[] xy = new float[1];
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        xy[0] = this.x;
        xy[1] = this.y;
    }

    public float[] getXY() {
        return xy;
    }

    @Override
    public String toString() {
        return "Một điểm được tạo có tọa độ x = "
                + x + " và tọa độ y = " + y;
    }
}
