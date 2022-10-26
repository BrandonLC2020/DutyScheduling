import java.util.Calendar;
import java.util.Date;

public class HolidayDuty implements DutyDay {
    public RA[] onDutyRAs;
    public RA ra1;
    public RA ra2;
    public Date date;
    public DayOfTheWeek dayOfTheWeek;


    public HolidayDuty(Date date, RA ra1, RA ra2) {
        this.date = date;
        this.ra1 = ra1;
        this.ra2 = ra2;
        RA[] ras = new RA[]{ra1, ra2};
        this.onDutyRAs = ras;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                this.dayOfTheWeek = DayOfTheWeek.SUNDAY;
            case 2:
                this.dayOfTheWeek = DayOfTheWeek.MONDAY;
            case 3:
                this.dayOfTheWeek = DayOfTheWeek.TUESDAY;
            case 4:
                this.dayOfTheWeek = DayOfTheWeek.WEDNESDAY;
            case 5:
                this.dayOfTheWeek = DayOfTheWeek.THURSDAY;
            case 6:
                this.dayOfTheWeek = DayOfTheWeek.FRIDAY;
            case 7:
                this.dayOfTheWeek = DayOfTheWeek.SATURDAY;
        }
    }

    public RA[] getRAsOnDuty() {
        return onDutyRAs;
    }

    public int getNumRAsOnDuty() {
        return 3;
    }

    public Date getDate() {
        return this.date;
    }

    public DayOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

}
