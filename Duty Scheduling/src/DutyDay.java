import java.util.Date;

public interface DutyDay {
    RA[] getRAsOnDuty();

    int getNumRAsOnDuty();

    DayOfTheWeek getDayOfTheWeek();

    Date getDate();
}
