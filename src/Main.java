import java.io.CharArrayReader;
import java.io.IOException;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //1 2 3 4 5 4 3 2 1 3 4
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        Map<Integer,Integer> map = new HashMap<>();
        int mapKey;
        for (int i = 0; i < arr.size(); i++) {
            mapKey = arr.get(i);
            if (map.containsKey(mapKey))
                map.put(mapKey, map.get(mapKey)+1);
            else
                map.put(mapKey, 1);
        }
        int highestKey = arr.get(0);
        int highestValue = map.get(highestKey);
        for (Integer key : map.keySet()) {
            if (highestValue < map.get(key)) {
                highestValue = map.get(key);
                highestKey = key;
            } else if (highestValue == map.get(key) && highestKey > key) {
                highestValue = map.get(key);
                highestKey = key;
            }

        }
        System.out.println(highestKey);
    }
}