import java.util.Date;

public interface WeekendDayDuty extends DutyDay {
    Date getDate();

    RA getPrimaryRA();

    RA getSecondaryRA();
}
