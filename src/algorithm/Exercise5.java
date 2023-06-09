package algorithm;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 199, 180};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != -1) {
                int min = a[i];
                int j;
                int index = i;
                for (j = i + 1; j < a.length; j++) {
                    if (min > a[j] && a[j] != -1) {
                        min = a[j];
                        index = j;
                    }
                }
                if (min != a[i]) {
                    int temp = a[i];
                    a[i] = a[index];
                    a[index] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
