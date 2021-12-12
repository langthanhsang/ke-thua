package kethua.CircleCylinder;

import kethua.th1.Circle;

public class Cylinder extends Circle {
    public double height;
    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;

    }
    public double getTheTich () {
        return Math.PI * Math.pow(getRadius(),2)*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + "the tich" +
                getTheTich()+
                +
                '}';
    }
}
