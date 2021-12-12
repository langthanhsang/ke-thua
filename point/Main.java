package kethua.point;



public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f, 4.0f);
        System.out.println(point2D);
        Point3D point3D = new Point3D(2.0f,4.4f,4.5f);
        point3D.setZ(5);
        System.out.println(point3D);
    }
}
