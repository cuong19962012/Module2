package algorithm;

public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1};
        int n = 7;
        int profit = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= n && arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (profit < arr[j] - arr[i])
                        profit = arr[j] - arr[i];
                }
            }
        }
        if (profit <= 0)
            System.out.println(n);
        else
            System.out.println(profit + n);
    }
}
