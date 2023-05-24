package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class IllustrationInsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 6, 9, 3, 2};
        System.out.print("Input: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Begin Sort => ");
        insertSort(arr);
        System.out.print("OutPut: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        int x;
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Start Sort Child Array (Start Index " + i + ")");
            x = arr[i];
            int j;
            for (j = i - 1; j >= 0 && x < arr[j]; j--) {
                /*Bring arr[j] to arr[j+1]*/
                System.out.println("Assign Value " + arr[j] + " To Index " + (j + 1));
                arr[j + 1] = arr[j];
            }
            System.out.println("Insert Value " + x + " In " + " Index " + (j + 1));
            /*May be sorted or not sorted, but always correct*/
            arr[j + 1] = x;
            System.out.println("Array After Insert: "+Arrays.toString(arr));
        }
        System.out.println("End Sort <=");
    }
}
