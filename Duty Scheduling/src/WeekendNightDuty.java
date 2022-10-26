import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class WeekendNightDuty implements DutyDay {
    public RA[] onDutyRAs;
    public RA primaryRA;
    public RA secondaryRA1;
    public RA secondaryRA2;
    public LocalDate date;
    public DayOfWeek dayOfTheWeek;

    public WeekendNightDuty(LocalDate date, RA primary, RA sec1, RA sec2) {
        this.date = date;
        this.primaryRA = primary;
        this.secondaryRA1 = sec1;
        this.secondaryRA2 = sec2;
        RA[] ras = new RA[]{primaryRA, secondaryRA1, secondaryRA2};
        this.onDutyRAs = ras;
        dayOfTheWeek = date.getDayOfWeek();
    }

    public WeekendNightDuty(LocalDate date) {
        this.date = date;
        this.primaryRA = null;
        this.secondaryRA1 = null;
        this.secondaryRA2 = null;
        RA[] ras = new RA[3];
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

    public RA[] getSecondaryRAs() {
        RA[] secondary = new RA[] {secondaryRA1, secondaryRA2};
        return secondary;
    }

    public boolean addPrimaryRA(RA ra) {
        if (onDutyRAs[0] == null) {
            onDutyRAs[0] = ra;
            primaryRA = ra;
            ra.setTotalWeekendNightDuty(ra.getTotalWeekendNightDuty() + 1);
            ra.setTotalWeekendNightPrimaryDuty(ra.getTotalWeekendNightPrimaryDuty() + 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean addSecondaryRA(RA ra) {
        if (onDutyRAs[1] == null) {
            onDutyRAs[1] = ra;
            secondaryRA1 = ra;
            ra.setTotalWeekendNightDuty(ra.getTotalWeekendNightDuty() + 1);
            ra.setTotalWeekendNightSecondaryDuty(ra.getTotalWeekendNightSecondaryDuty() + 1);
            return true;
        } else if (onDutyRAs[2] == null) {
            onDutyRAs[2] = ra;
            secondaryRA2 = ra;
            ra.setTotalWeekendNightDuty(ra.getTotalWeekendNightDuty() + 1);
            ra.setTotalWeekendNightSecondaryDuty(ra.getTotalWeekendNightSecondaryDuty() + 1);
            return true;
        } else {
            return false;
        }
    }
}
