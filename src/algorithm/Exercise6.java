package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "abdceffecdba";
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }
        List<Character> result = new ArrayList<>();
        for (Character key : map.keySet()) {
            if (map.get(key) > 1)
                result.add(key);
        }
        System.out.println(result);
    }
}
