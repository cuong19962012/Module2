
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        LocalDate todaydate = LocalDate.now();
        System.out.println("Months first date in yyyy-mm-dd: " +todaydate.getYear());
    }
}