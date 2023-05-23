package ss13_search_algorithm.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAlgorithmUseRecursive {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 9, 32, 54, 34, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Index Of X: " + sortAlgorithm(arr, 0, arr.length - 1, 4));
    }

    static int sortAlgorithm(int[] arr, int first, int last, int x) {
        if (first > last)
            return -1;
        int mid = (first + last) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (x > arr[mid]) {
            first = mid + 1;
        } else
            last = mid - 1;
        return sortAlgorithm(arr, first, last, x);
    }
}
