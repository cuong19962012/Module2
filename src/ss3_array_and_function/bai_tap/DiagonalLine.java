package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class DiagonalLine {
    public static void main(String[] args) {
        int size1;
        int size2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a row: ");
            size1 = scanner.nextInt();
            System.out.println("Enter a column: ");
            size2 = scanner.nextInt();
        } while (size1 > 20 || size2 > 20);

        int[][] matrix = new int[size1][size2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter Matrix[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    total += matrix[i][j];
                }
            }
        }
        System.out.print("Result is: " + total);
    }
}
