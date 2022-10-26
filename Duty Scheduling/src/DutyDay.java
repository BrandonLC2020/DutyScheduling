import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public interface DutyDay {
    RA[] getRAsOnDuty();

    int getNumRAsOnDuty();

    DayOfWeek getDayOfWeek();

    LocalDate getDate();
}
