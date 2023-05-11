package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return Math.PI * super.getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height: "
                + getHeight()
                + " ,Which is a subclass of "
                + super.toString();
    }
}
