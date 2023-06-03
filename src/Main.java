
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(null, 3);
        map.put(null, 2);
        map.put(1, 1);
        map.put(8, 1);
        map.put(6, 1);
        map.put(10, 1);
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
    }
}