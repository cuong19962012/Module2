package ss5_access_modifier.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}
