package ss7_adstract_class_and_interface.bai_tap.colorable;

/**
 *
 */
public class Square extends Shape implements Colorable {
    private double side = 1.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }

    public double getArea() {
        return side * side;
    }
}
