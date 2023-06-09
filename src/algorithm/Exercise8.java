package algorithm;

import java.util.HashMap;

public class Exercise8 {
    public static void main(String[] args) {
        int[] parent = {1,2,3};
        int[] child = {1,1,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer e : child) {
            map.put(e, 0);
        }
        for (Integer e : parent) {
            if (map.containsKey(e))
                map.put(e, map.get(e) + 1);
        }
        int min = map.get(child[0]);
        for (Integer key : map.keySet()) {
            if (min > map.get(key))
                min = map.get(key);
        }
        System.out.println(min);
    }
}
