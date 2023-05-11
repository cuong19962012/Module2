package ss6_inheritance.bai_tap.circle_and_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.8);
        System.out.println(cylinder);
        cylinder = new Cylinder(5.8, 3.0, "Blue");
        System.out.println(cylinder);
    }
}
