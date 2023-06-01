
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.util.concurrent.TimeUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        LocalDate dateBefore= LocalDate.of(2005,6,1);
        LocalDate dateAfter=LocalDate.now();
        long day=ChronoUnit.YEARS.between(dateBefore,dateAfter);
        System.out.println(day);
    }
}