import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

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

        if (monthName.equals("January")) {
            numMonth = 1;
        } else if (monthName.equals("February")) {
            numMonth = 2;
        } else if (monthName.equals("March")) {
            numMonth = 3;
        } else if (monthName.equals("April")) {
            numMonth = 4;
        } else if (monthName.equals("May")) {
            numMonth = 5;
        } else if (monthName.equals("June")) {
            numMonth = 6;
        } else if (monthName.equals("July")) {
            numMonth = 7;
        } else if (monthName.equals("August")) {
            numMonth = 8;
        } else if (monthName.equals("September")) {
            numMonth = 9;
        } else if (monthName.equals("October")) {
            numMonth = 10;
        } else if (monthName.equals("November")) {
            numMonth = 11;
        } else {
            numMonth = 12;
        }
        int numDaysInMonth = 0;
        switch (numMonth) {
            case 1:
                numDaysInMonth = 31;
                break;
            case 2:
                if (year % 4 == 0) {
                    numDaysInMonth = 29;
                } else {
                    numDaysInMonth = 28;
                }
                break;
            case 3:
                numDaysInMonth = 31;
                break;
            case 4:
                numDaysInMonth = 30;
                break;
            case 5:
                numDaysInMonth = 14; // because of finals week
                break;
            case 6:
                numDaysInMonth = 30;
                break;
            case 7:
                numDaysInMonth = 31;
                break;
            case 8:
                numDaysInMonth = 31;
                break;
            case 9:
                numDaysInMonth = 30;
                break;
            case 10:
                numDaysInMonth = 31;
                break;
            case 11:
                numDaysInMonth = 30;
                break;
            case 12:
                numDaysInMonth = 31;
        }
        int startDate = 1;
        if (numMonth == 1) {
            startDate = 4;
        } else if (numMonth == 5) {
            startDate = 7;
        }
        startOfMonth = LocalDate.of(year, numMonth, startDate);
        endOfMonth = LocalDate.of(year, numMonth, numDaysInMonth);
        allDutyDays = new ArrayList<DutyDay>();
        fillDutyDays(startOfMonth, endOfMonth);
    }

    private void fillDutyDays(LocalDate start, LocalDate end) {
        for (LocalDate date = start; date.isBefore(end.plusDays(1)); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            switch (dayOfWeek) {
                case MONDAY:
                    if (!Analyzer.holidays.contains(date)) {
                        allDutyDays.add(new WeekdayDuty(date));
                    } else {
                        allDutyDays.add(new HolidayDuty(date));
                    }
                    break;
                case TUESDAY:
                    if (!Analyzer.holidays.contains(date)) {
                        allDutyDays.add(new WeekdayDuty(date));
                    } else {
                        allDutyDays.add(new HolidayDuty(date));
                    }
                    break;
                case WEDNESDAY:
                    if (!Analyzer.holidays.contains(date)) {
                        allDutyDays.add(new WeekdayDuty(date));
                    } else {
                        allDutyDays.add(new HolidayDuty(date));
                    }
                    break;
                case THURSDAY:
                    if (!Analyzer.holidays.contains(date)) {
                        allDutyDays.add(new WeekendNightDuty(date));
                    } else {
                        allDutyDays.add(new HolidayDuty(date));
                    }
                    break;
                case FRIDAY:
                    if (!Analyzer.holidays.contains(date)) {
                        allDutyDays.add(new WeekendNightDuty(date));
                    } else {
                        allDutyDays.add(new HolidayDuty(date));
                    }
                    break;
                case SATURDAY:
                    if (!Analyzer.holidays.contains(date)) {
                        allDutyDays.add(new WeekendNightDuty(date));
                        allDutyDays.add(new WeekendDayDuty(date));
                    } else {
                        allDutyDays.add(new HolidayDuty(date));
                    }
                    break;
                case SUNDAY:
                    if (!Analyzer.holidays.contains(date)) {
                        allDutyDays.add(new WeekdayDuty(date));
                        allDutyDays.add(new WeekendDayDuty(date));
                    } else {
                        allDutyDays.add(new HolidayDuty(date));
                    }
                    break;
            }
        }
    }

    public boolean addRAToDate(LocalDate date, RA ra, boolean isPrimary) {
        for (int i = 0; i < allDutyDays.size(); i++) {
            if (allDutyDays.get(i).getDate().equals(date)) {
                if (allDutyDays.get(i) instanceof HolidayDuty) {
                    HolidayDuty temp = (HolidayDuty) allDutyDays.remove(i);
                    boolean addition = temp.addRA(ra);
                    allDutyDays.add(temp);
                    return addition;
                } else if (allDutyDays.get(i) instanceof WeekdayDuty) {
                    WeekdayDuty temp = (WeekdayDuty) allDutyDays.remove(i);
                    boolean addition;
                    if (isPrimary) {
                        addition = temp.addPrimaryRA(ra);
                    } else {
                        addition = temp.addSecondaryRA(ra);
                    }
                    allDutyDays.add(temp);
                    return addition;
                } else if (allDutyDays.get(i) instanceof WeekendDayDuty) {
                    WeekendDayDuty temp = (WeekendDayDuty) allDutyDays.remove(i);
                    boolean addition;
                    if (isPrimary) {
                        addition = temp.addPrimaryRA(ra);
                    } else {
                        addition = temp.addSecondaryRA(ra);
                    }
                    allDutyDays.add(temp);
                    return addition;
                } else if (allDutyDays.get(i) instanceof WeekendNightDuty) {
                    WeekendNightDuty temp = (WeekendNightDuty) allDutyDays.remove(i);
                    boolean addition;
                    if (isPrimary) {
                        addition = temp.addPrimaryRA(ra);
                    } else {
                        addition = temp.addSecondaryRA(ra);
                    }
                    allDutyDays.add(temp);
                    return addition;
                }
            }
        }
        return false;
    }

}
