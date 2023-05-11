package ss6_inheritance.thuc_hanh;

public class Square extends Rectangle {
    Square() {

    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side: "
                + getSide()
                + " ,Which is a subclass of : "
                + super.toString();
    }

}
