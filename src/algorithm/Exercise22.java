package algorithm;

import java.util.Arrays;

public class Exercise22 {
    public static void main(String[] args) {
        int n = 17;
        int[] arr = new int[2];
        FOR:
        for (int i = 2; i < n - 1; i++) {
            if (isPrime(i)) {
                for (int j = i; j < n - 1; j++) {
                    if (isPrime(j) && i + j == n) {
                        arr[0]=i;
                        arr[1]=j;
                        break FOR;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
