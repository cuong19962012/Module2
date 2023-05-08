package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter a element " + (i + 1) + " in the array 1");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter a element " + (i + 1) + " in the array 2");
            array2[i] = scanner.nextInt();
        }
        int[] array3 = new int[array1.length + array2.length];
        for (int j = 0; j < array1.length; j++) {
            array3[j] = array1[j];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }
        System.out.print("Property list:  ");
        for (int k : array3) {
            System.out.print(k + " \t ");
        }
    }
}
