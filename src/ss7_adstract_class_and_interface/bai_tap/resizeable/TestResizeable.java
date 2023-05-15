package ss7_adstract_class_and_interface.bai_tap.resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Resizeable[] shape = new Resizeable[3];
        shape[0] = new Circle(3.6);
        shape[1] = new Rectangle(4, 5);
        shape[2] = new Square(4.0);
        System.out.println("Pre-increase: ");
        for (Resizeable o : shape) {
            System.out.println(o.getArea());
        }
        shape[0].resize(30);
        shape[1].resize(50);
        shape[2].resize(20.2);
        System.out.println("After-increase: ");
        for (Resizeable o : shape) {
            System.out.println(o.getArea());
        }
    }
}
