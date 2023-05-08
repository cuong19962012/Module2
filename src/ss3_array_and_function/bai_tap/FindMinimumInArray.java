package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class FindMinimumInArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a value in " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.print("Array list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println("\nthe most smallest element is: " + min);
    }
}
