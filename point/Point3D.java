package kethua.point;

public class Point3D  extends Point2D{
    private float z;
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
    public double[] getXYZ () {
        double [] array = new double[] {getZ(), getX(),getY()};
        return  array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
