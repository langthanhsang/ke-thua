package kethua.CircleCylinder;


public class MainCircleCylinder {
    public static void main(String[] args) {
      Circle circle = new Circle();
      circle = new Circle(10, "black");
        System.out.println(circle);
        circle.setRadius(5);
        System.out.println(circle.getPerimeter());

        Cylinder cylinder = new Cylinder();
        cylinder= new Cylinder(5, "black", false, 10);
        System.out.println(cylinder);


    }
}
