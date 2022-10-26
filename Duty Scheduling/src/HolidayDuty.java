import java.time.DayOfWeek;
import java.time.LocalDate;

public class HolidayDuty implements DutyDay {
    public RA[] onDutyRAs;
    public RA ra1;
    public RA ra2;
    public LocalDate date;
    public DayOfWeek dayOfTheWeek;

    public HolidayDuty(LocalDate date) {
        this.date = date;
        this.ra1 = null;
        this.ra2 = null;
        RA[] ras = new RA[2];
        this.onDutyRAs = ras;
        dayOfTheWeek = date.getDayOfWeek();
    }

    public HolidayDuty(LocalDate date, RA ra1, RA ra2) {
        this.date = date;
        this.ra1 = ra1;
        this.ra2 = ra2;
        RA[] ras = new RA[]{ra1, ra2};
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

    public boolean addRA(RA ra) {
        int numRAsAssignedToDay = 0;
        for (int i = 0; i < onDutyRAs.length; i++) {
            if(onDutyRAs[i] != null) {
                numRAsAssignedToDay++;
            }
        }

        if (numRAsAssignedToDay == getNumRAsOnDuty()) {
            return false;
        }

        if (onDutyRAs[0] != null) {
            onDutyRAs[0] = ra;
        } else {
            onDutyRAs[1] = ra;
        }

        return true;
    }

}
