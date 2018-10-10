package exercise4_Point2D_Point3D;


public class Point2D {
    private float x = 1.0f;
    private float y = 1.0f;
    private float[] xy = new float[2];

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
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

    public float[] getXY(){
        return xy;
    }

    public void setXY(float x, float y){
        xy[0] = x;
        xy[1] = y;
    }

    @Override
    public String toString(){
        return "Một Point2D có tọa độ x và y tại điểm xy = ("
                +getXY()[0]+", "
                +getXY()[1]+")";
    }
}
