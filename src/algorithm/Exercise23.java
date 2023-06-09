package algorithm;

public class Exercise23 {
    public static void main(String[] args) {
        int[] arr = {0, 4, 8 , 11};
        boolean flag = true;
        if (arr.length < 2)
            flag = false;
        else {
            int arithmeticProgression = arr[1] - arr[0];
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i + 1] - arr[i] != arithmeticProgression) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
