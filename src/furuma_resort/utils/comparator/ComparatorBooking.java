package furuma_resort.utils.comparator;

import furuma_resort.model.booking.Booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class ComparatorBooking implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        Date o1Start = null;
        Date o2Start = null;
        Date o1End = null;
        Date o2End = null;
        try {
            o1Start = new SimpleDateFormat("dd-MM-yyyy").parse(o1.getDateStart());
            o1End = new SimpleDateFormat("dd-MM-yyyy").parse(o1.getDateEnd());
            o2Start = new SimpleDateFormat("dd-MM-yyyy").parse(o2.getDateStart());
            o2End = new SimpleDateFormat("dd-MM-yyyy").parse(o2.getDateEnd());
        } catch (ParseException e) {
            System.out.println("Runtime exception");
        }
        if (o2Start.equals(o1Start))
            if(o2End.equals(o1End))
                return o2.getIdBooking().compareTo(o1.getIdBooking());
            else
                return o2End.compareTo(o1End);
        else
            return o2Start.compareTo(o1Start);
    }
}
