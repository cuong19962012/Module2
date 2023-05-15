package ss5_access_modifier.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.5);
        Circle circle2 = new Circle();
        System.out.println("Cricle1 : " + circle1.getRadius() + " " + circle1.getArea());
        System.out.println("Cricle2 : " + circle2.getRadius() + " " + circle2.getArea());
    }
}
