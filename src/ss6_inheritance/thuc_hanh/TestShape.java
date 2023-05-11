package ss6_inheritance.thuc_hanh;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("Red", false);
        System.out.println(shape);
    }
}
