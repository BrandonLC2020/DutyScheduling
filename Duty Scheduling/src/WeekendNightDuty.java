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
}
