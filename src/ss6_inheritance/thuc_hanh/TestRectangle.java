package ss6_inheritance.thuc_hanh;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8, "Orange", true);
        System.out.println(rectangle);
    }
}
