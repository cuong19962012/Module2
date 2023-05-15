package ss7_adstract_class_and_interface.thuc_hanh.comparable_for_geometry;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "Indigo", false);
        System.out.println("Pre-Sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-Sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
