package ss7_adstract_class_and_interface.bai_tap.resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void resize(double percent) {
        if (percent <= 100) {
            width = width + (width * percent / 100);
            length = length + (length * percent / 100);
        }
    }

    public double getArea() {
        return width * length;
    }
}
