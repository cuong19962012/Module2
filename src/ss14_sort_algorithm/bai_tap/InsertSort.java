package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 6, 9, 3, 2};
        System.out.print("Input: ");
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.print("OutPut: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            int j;
            for (j = i - 1; j >= 0 && x < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = x;
            System.out.println(Arrays.toString(arr));
        }
    }
}
