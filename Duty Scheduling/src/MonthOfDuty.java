import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MonthOfDuty {

    private String month;
    private int year;
    private LocalDate startOfMonth;
    private LocalDate endOfMonth;

    private ArrayList<DutyDay> allDutyDays;

    public MonthOfDuty(String monthName, int year) {
        this.month = monthName;
        this.year = year;
        int numMonth = 0;
        switch (monthName) {
            case "January":
                numMonth = 1;
            case "February":
                numMonth = 2;
            case "March":
                numMonth = 3;
            case "April":
                numMonth = 4;
            case "May":
                numMonth = 5;
            case "June":
                numMonth = 6;
            case "July":
                numMonth = 7;
            case "August":
                numMonth = 8;
            case "September":
                numMonth = 9;
            case "October":
                numMonth = 10;
            case "November":
                numMonth = 11;
            case "December":
                numMonth = 12;
        }
        int numDaysInMonth = 0;
        switch (numMonth) {
            case 1:
                numDaysInMonth = 31;
            case 2:
                if (year % 4 == 0) {
                    numDaysInMonth = 29;
                } else {
                    numDaysInMonth = 28;
                }
            case 3:
                numDaysInMonth = 31;
            case 4:
                numDaysInMonth = 30;
            case 5:
                numDaysInMonth = 31;
            case 6:
                numDaysInMonth = 30;
            case 7:
                numDaysInMonth = 31;
            case 8:
                numDaysInMonth = 31;
            case 9:
                numDaysInMonth = 30;
            case 10:
                numDaysInMonth = 31;
            case 11:
                numDaysInMonth = 30;
            case 12:
                numDaysInMonth = 31;
        }
        startOfMonth = LocalDate.of(year, numMonth, 1);
        endOfMonth = LocalDate.of(year, numMonth, numDaysInMonth);
        fillDutyDays(startOfMonth, endOfMonth);
    }

    private void fillDutyDays(LocalDate start, LocalDate end) {
        for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            switch (dayOfWeek) {
                case MONDAY:
                    allDutyDays.add(new WeekdayDuty(date));
                case TUESDAY:
                    allDutyDays.add(new WeekdayDuty(date));
                case WEDNESDAY:
                    allDutyDays.add(new WeekdayDuty(date));
                case THURSDAY:
                    allDutyDays.add(new WeekendNightDuty(date));
                case FRIDAY:
                    allDutyDays.add(new WeekendNightDuty(date));
                case SATURDAY:
                    allDutyDays.add(new WeekendNightDuty(date));
                    allDutyDays.add(new WeekendDayDuty(date));
                case SUNDAY:
                    allDutyDays.add(new WeekdayDuty(date));
                    allDutyDays.add(new WeekendDayDuty(date));
            }
        }
    }

}
