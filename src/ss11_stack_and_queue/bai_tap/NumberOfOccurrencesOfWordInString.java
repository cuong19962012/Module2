package ss11_stack_and_queue.bai_tap;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NumberOfOccurrencesOfWordInString {
    public static void main(String[] args) {
        String str = "aaa bb ccc";
        Map<String, Integer> map = new TreeMap<>();
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i].toLowerCase())) {
                    map.put(arr[i].toLowerCase(), map.get(arr[i].toLowerCase()) + 1);
                } else {
                    map.put(arr[i].toLowerCase(), 1);
                }
        }
        System.out.println(map);
    }
}
