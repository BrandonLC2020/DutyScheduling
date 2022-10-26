import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class WeekdayDuty implements DutyDay {
    public RA[] onDutyRAs;
    public RA primaryRA;
    public RA secondaryRA;
    public LocalDate date;
    public DayOfWeek dayOfTheWeek;


    public WeekdayDuty(LocalDate date, RA primary, RA sec1) {
        this.date = date;
        this.primaryRA = primary;
        this.secondaryRA = sec1;
        RA[] ras = new RA[]{primaryRA, secondaryRA};
        this.onDutyRAs = ras;
        dayOfTheWeek = date.getDayOfWeek();
    }

    public WeekdayDuty(LocalDate date) {
        this.date = date;
        this.primaryRA = null;
        this.secondaryRA = null;
        RA[] ras = new RA[2];
        this.onDutyRAs = ras;
        dayOfTheWeek = date.getDayOfWeek();
    }

    public RA[] getRAsOnDuty() {
        return onDutyRAs;
    }

    public int getNumRAsOnDuty() {
        return 3;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfTheWeek;
    }


    public RA getPrimaryRA() {
        return primaryRA;
    }

    public RA getSecondaryRAs() {
        return secondaryRA;
    }

    public boolean addPrimaryRA(RA ra) {
        if (onDutyRAs[0] == null) {
            onDutyRAs[0] = ra;
            primaryRA = ra;
            ra.setTotalWeekdayDuty(ra.getTotalWeekdayDuty() + 1);
            ra.setTotalWeekdayPrimaryDuty(ra.getTotalWeekdayPrimaryDuty() + 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean addSecondaryRA(RA ra) {
        if (onDutyRAs[1] == null) {
            onDutyRAs[1] = ra;
            secondaryRA = ra;
            ra.setTotalWeekdayDuty(ra.getTotalWeekdayDuty() + 1);
            ra.setTotalWeekdaySecondaryDuty(ra.getTotalWeekdaySecondaryDuty() + 1);
            return true;
        } else {
            return false;
        }
    }
}
