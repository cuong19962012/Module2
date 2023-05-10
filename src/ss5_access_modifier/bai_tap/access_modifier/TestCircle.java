package ss5_access_modifier.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Cricle circle1 = new Cricle(1.5);
        Cricle circle2 = new Cricle();
        System.out.println("Cricle1 : " + circle1.getRadius() + " " + circle1.getArea());
        System.out.println("Cricle2 : " + circle2.getRadius() + " " + circle2.getArea());
    }
}
