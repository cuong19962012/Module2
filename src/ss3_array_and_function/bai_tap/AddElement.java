package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class AddElement {
    static int[] insertElement(int[] array, int index, int addValue) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = addValue;
        return array;
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
            System.out.print(j + " \t");
        }
        System.out.print("Enter add value: ");
        int addValue = scanner.nextInt();
        int index;
        do {
            System.out.print("Enter index add value position: ");
            index = scanner.nextInt();
        } while (index < -1 || index >= array.length - 1);
        array = insertElement(array, index, addValue);
        for (int i : array) {
            System.out.print(i + " \t ");
        }
    }
}
