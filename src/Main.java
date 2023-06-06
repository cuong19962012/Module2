
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.util.concurrent.TimeUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        queue.offer(10);
        queue.offer(11);
        queue.offer(4);
        queue.offer(0);
        System.out.println(queue);
        System.out.println(queue.poll());
    }
}