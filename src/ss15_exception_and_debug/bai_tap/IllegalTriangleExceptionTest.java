package ss15_exception_and_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a first side : ");
            int side1 = scanner.nextInt();
            System.out.println("Enter a second side : ");
            int side2 = scanner.nextInt();
            System.out.println("Enter a third side : ");
            int side3 = scanner.nextInt();
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                throw new IllegalTriangleException("Side Minus");
            }
            if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
                throw new IllegalTriangleException("Add Two Side Smaller Than One Side");
            }
        } catch (IllegalTriangleException ite) {
            System.out.println(ite.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println("Enter A Number");
        }
    }

}
