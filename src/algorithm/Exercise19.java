package algorithm;

import java.util.HashMap;

public class Exercise19 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 3, 1, 3, 2};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            else
                hashMap.put(arr[i], 1);
        }
        int temp = hashMap.get(arr[0]);
        boolean result = true;
        for (Integer value : hashMap.values()) {
            if (temp != value) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
