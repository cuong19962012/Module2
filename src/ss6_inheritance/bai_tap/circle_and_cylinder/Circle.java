package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius: "
                + getRadius()
                + " and color: "
                + getColor();
    }
}
