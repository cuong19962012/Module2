package ss6_inheritance.bai_tap.building_class_triangle;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("Yellow", true);
        System.out.println(shape);
    }
}
