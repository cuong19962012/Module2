package ss15_exception_and_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        do {
            do {
                System.out.println("Enter A First Side : ");
                try {
                    side1 = Integer.parseInt(scanner.nextLine());
                    if (side1 < 0)
                        throw new IllegalTriangleException("Side Minus! Repeat Enter!");
                    break;
                } catch (IllegalTriangleException ite) {
                    System.out.println(ite.getMessage());
                } catch (NumberFormatException nfe) {
                    System.out.println("Not A Number! Repeat Enter!");
                } catch (Exception e) {
                    System.out.println("Don't Know What Exception! Repeat Enter!");
                }
            } while (true);
            do {
                System.out.println("Enter A Second side : ");
                try {
                    side2 = Integer.parseInt(scanner.nextLine());
                    if (side2 < 0)
                        throw new IllegalTriangleException("Side Minus! Repeat Enter!");
                    break;
                } catch (IllegalTriangleException ite) {
                    System.out.println(ite.getMessage());
                } catch (NumberFormatException nfe) {
                    System.out.println("Not A Number! Repeat Enter!");
                } catch (Exception e) {
                    System.out.println("Don't Know What Exception! Repeat Enter!");
                }
            } while (true);
            do {
                System.out.println("Enter A Third Side : ");
                try {
                    side3 = Integer.parseInt(scanner.nextLine());
                    if (side3 < 0)
                        throw new IllegalTriangleException("Side Minus! Repeat Enter!");
                    break;
                } catch (IllegalTriangleException ite) {
                    System.out.println(ite.getMessage());
                } catch (NumberFormatException nfe) {
                    System.out.println("Not A Number! Repeat Enter!");
                } catch (Exception e) {
                    System.out.println("Don't Know What Exception! Repeat Enter!");
                }
            } while (true);
            try {
                if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
                    throw new IllegalTriangleException("Two Side Total Than Less One Side");
                }
                break;
            } catch (IllegalTriangleException ite) {
                System.out.println(ite.getMessage());
            } catch (Exception e) {
                System.out.println("Don't Know What Exception! Repeat Enter!");
            }
        } while (true);
    }

}
