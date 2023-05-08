package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class TotalChoiceColumn {
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
        int col;
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        do {
            System.out.println("Column you wanna addition is : ");
            col = scanner.nextInt();
        } while (col > matrix[0].length - 1 || col < 0);
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][col];
        }
        System.out.println("Total is: " + total);
    }
}
