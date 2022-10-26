import java.util.Date;

public interface WeekdayDuty extends DutyDay {
    Date getDate();

    RA getPrimaryRA();

    RA getSecondaryRA();
}
