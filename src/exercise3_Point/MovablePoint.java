package exercise3_Point;

public class MovablePoint extends Point {
    private float xSpeed = 1.0f;
    private float ySpeed = 1.0f;
    private float[] xySpeed = new float[1];
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return xySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        xySpeed[0] = xSpeed;
        xySpeed[1] = ySpeed;
    }

    public float move(){
        return 0;
    }

    public String toString(){
        return "Một tọa độ được di chuyển với tốc độ xSpeed = "
                +xSpeed+" và tốc độ ySpeed = "
                +ySpeed+" có tọa độ được sinh ra từ lớp cha là "
                +super.toString();
    }
}
