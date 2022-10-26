import java.util.Date;

public interface WeekendNightDuty extends DutyDay {
    Date getDate();

    RA getPrimaryRA();

    RA[] getSecondaryRAs();
}
