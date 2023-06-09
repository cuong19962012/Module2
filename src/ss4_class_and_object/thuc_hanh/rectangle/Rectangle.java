package ss4_class_and_object.thuc_hanh.rectangle;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{Width=" + width + ",Height= " + height + "}";
    }
}
