package ss7_adstract_class_and_interface.bai_tap.colorable;

/**
 *
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
