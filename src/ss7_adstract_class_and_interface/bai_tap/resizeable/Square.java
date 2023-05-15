package ss7_adstract_class_and_interface.bai_tap.resizeable;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return super.getLength();
    }

}
