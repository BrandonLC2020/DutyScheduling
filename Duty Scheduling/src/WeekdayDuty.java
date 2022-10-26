import java.util.Calendar;
import java.util.Date;

public class WeekdayDuty implements DutyDay {
    public RA[] onDutyRAs;
    public RA primaryRA;
    public RA secondaryRA;
    public Date date;
    public DayOfTheWeek dayOfTheWeek;


    public WeekdayDuty(Date date, RA primary, RA sec1) {
        this.date = date;
        this.primaryRA = primary;
        this.secondaryRA = sec1;
        RA[] ras = new RA[]{primaryRA, secondaryRA};
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

    public RA getPrimaryRA() {
        return primaryRA;
    }

    public RA getSecondaryRAs() {
        return secondaryRA;
    }
}
