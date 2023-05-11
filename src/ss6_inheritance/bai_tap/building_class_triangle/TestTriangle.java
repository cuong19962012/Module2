package ss6_inheritance.bai_tap.building_class_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        float a, b, c;
        String color;
        boolean filled;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter b: ");
        b = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter c: ");
        c = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter a color: ");
        color = scanner.nextLine();
        System.out.println("Is it filled: ");
        filled = scanner.hasNext();
        Triangle triangle = new Triangle(a, b, c);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println(triangle);
    }
}
