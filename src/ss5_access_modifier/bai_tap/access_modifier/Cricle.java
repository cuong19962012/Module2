package ss5_access_modifier.bai_tap.access_modifier;

public class Cricle {
    private double radius = 1.0;
    private String color = "Red";

    Cricle() {

    }

    Cricle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * 3.14;
    }
}
