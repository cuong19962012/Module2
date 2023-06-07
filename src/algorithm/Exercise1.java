package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 1};
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer e : inputArray) {
            if (map.containsKey(e))
                map.put(e, map.get(e) + 1);
            else
                map.put(e, 1);
        }
        boolean flag=true;
        int temp = inputArray[0];
        for (Integer key : map.keySet()) {

            if (map.get(temp) != map.get(key)) {
                flag=false;
                break;
            }
            temp = key;
        }
        if(flag)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
