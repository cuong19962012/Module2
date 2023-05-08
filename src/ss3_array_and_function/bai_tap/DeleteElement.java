package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static int parrot(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.print("Size is over");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array property list : ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        int valueDelete;
        int index;
        do {
            System.out.print("Enter value you wanna delete: ");
            valueDelete = scanner.nextInt();
            index = parrot(array, valueDelete);
            if (index != -1) {
                for (int i = index; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = 0;
                System.out.print("Array list: ");
                for (int j : array) {
                    System.out.print(j + "\t");
                }
            } else {
                System.out.println("Value is different from element");
            }
        } while (index == -1);
    }
}
