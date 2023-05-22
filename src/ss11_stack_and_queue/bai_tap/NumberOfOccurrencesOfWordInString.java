package ss11_stack_and_queue.bai_tap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NumberOfOccurrencesOfWordInString {
    public static void main(String[] args) {
        String str = "aaa bb ccc";
        Map<String, Integer> map = new TreeMap<>();
        Set<String> keySet = map.keySet();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            for (String k : keySet) {
                if (arr[i].toLowerCase().equals(map.get(k))) {
                    map.put(k, map.get(k) + 1);
                } else {
                    map.put(k, 1);
                }
            }
        }
        System.out.println(map);
    }
}
