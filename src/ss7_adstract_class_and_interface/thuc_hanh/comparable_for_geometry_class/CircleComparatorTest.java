package ss7_adstract_class_and_interface.thuc_hanh.comparable_for_geometry_class;

import ss7_adstract_class_and_interface.thuc_hanh.comparable_for_geometry.Circle;

import java.util.Comparator;
import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.6, "Indigo", false);
        System.out.println("Pre-Sort: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-Sort:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
