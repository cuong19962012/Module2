package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {
        int[] arr ={4,4,4};
        int count = 0;
        int temp = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            else
                hashMap.put(arr[i], 1);
        }

        if (hashMap.containsKey(2)) {
            count += hashMap.get(2) / 2;
            if(hashMap.get(2)%2!=0)
                temp+=2;
        }

        if (hashMap.containsKey(4)) {
            count += hashMap.get(4);
        }

        if (hashMap.containsKey(1) && hashMap.containsKey(3)) {
            if (hashMap.get(3) / hashMap.get(1) < 1) {
                count += hashMap.get(3);
                temp += (hashMap.get(1) - hashMap.get(3));
            } else {
                count += hashMap.get(3);
            }
        } else if (hashMap.containsKey(3)) {
            count += hashMap.get(3);
        } else if(hashMap.containsKey(1)) {
            temp += hashMap.get(1);
        }

        if (temp % 4 == 0)
            count += temp / 4;
        else
            count += temp / 4 + 1;
        System.out.println(count);
    }
}
