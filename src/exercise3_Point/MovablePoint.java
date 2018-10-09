package exercise3_Point;

public class MovablePoint extends Point {
    private float xSpeed = 1.0f;
    private float ySpeed = 1.0f;
    private float[] xySpeed = new float[10];

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

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

    public float[] getSpeed() {
        return xySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        xySpeed[0] = xSpeed;
        xySpeed[1] = ySpeed;
    }

    public MovablePoint move() {
        float x = super.getXY()[0] + xSpeed;
        float y = super.getXY()[1] + ySpeed;
        super.setXY(x, y);
        return this;
    }

    @Override
    public String toString() {
        return super.toString()+" được di chuyển với tốc độ xSpeed = "
                + xSpeed + " và tốc độ ySpeed = "
                + ySpeed + "\n đang di chuyển và tọa độ mới là "
                + "(" + super.getXY()[0] + " - " + super.getXY()[1] + ")";
    }
}
