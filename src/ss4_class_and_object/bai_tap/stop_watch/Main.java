package ss4_class_and_object.bai_tap.stop_watch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Bắt đầu đếm thời gian!");
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = (int) (Math.random() * 10000 + 1);
        }
        bubbleSort(array, 10000);
        stopWatch.stop();
        System.out.println("Đếm thời gian xong!");

        System.out.println("Mất :" + stopWatch.getElapsedTime() + " Mili Giây");
    }

    static void bubbleSort(int arr[], int n) {
        if (n == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }
}
