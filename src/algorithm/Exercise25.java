package algorithm;

public class Exercise25 {


    public static void main(String[] args) {
        float[] arr = {22343534.12F, 42312312.13F, 7235345.154F};
        float x = 0;
        float max = Math.abs(arr[0] - x);
        float result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < (Math.abs(arr[i] - x))) {
                max = Math.abs(arr[i] - x);
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
