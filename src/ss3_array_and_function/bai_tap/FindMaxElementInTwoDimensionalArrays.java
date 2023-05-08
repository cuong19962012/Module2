package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class FindMaxElementInTwoDimensionalArrays {
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

        double[][] matrix = new double[size1][size2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter Matrix[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " \t ");
            }
            System.out.println("");
        }
        //{{1.3, 2.4, 3}, {4, 5.5, 6}, {7.7, 8, 9.9}};

        int rowIndex = 0;
        int colIndex = 0;
        double max = matrix[rowIndex][colIndex];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.println("most value element: " + max + " in position [" + rowIndex + "][" + colIndex + "]");
    }
}
