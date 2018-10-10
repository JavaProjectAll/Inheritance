package exercise4_Point2D_Point3D;

public class Point3D extends Point2D {
    private float z = 0.0f;
    private float[] xyz = new float[3];

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return xyz;
    }

    public void setXYZ(float x, float y, float z) {
        xyz[0] = x;
        xyz[1] = y;
        xyz[2] = z;
    }

    @Override
    public String toString() {
        return "Một Point3D có tọa độ xyz = ("
                + getXYZ()[0] + ", "
                + getXYZ()[1] + ", "
                + getXYZ()[2] + ")\n được kế thừa bởi "
                + super.toString();
    }
}
