package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        String s1 = "Abcdef1234";
        String s2 = "Uykhldg1";
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains("" + s1.charAt(i))) {
                if (map.containsKey(s1.charAt(i)))
                    map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
                else
                    map.put(s1.charAt(i), 1);
            }
        }
        for (Character key : map.keySet()) {
            count += map.get(key);
        }
        System.out.println(count);
    }
}
