package ss7_adstract_class_and_interface.bai_tap.resizeable;

public class Circle implements Resizeable {
    private double radius;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double percent) {
        if (percent <= 100) {
            radius = radius + (radius * percent / 100);
        }
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
