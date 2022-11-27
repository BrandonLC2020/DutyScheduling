import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Tester {
    public static void main(String[] args) {
        Analyzer testAnalyzer = new Analyzer();
        MonthOfDuty january = new MonthOfDuty("January", 2023);
        MonthOfDuty february = new MonthOfDuty("February", 2023);
        MonthOfDuty march = new MonthOfDuty("March", 2023);
        MonthOfDuty april = new MonthOfDuty("April", 2023);
        MonthOfDuty may = new MonthOfDuty("May", 2023);
        RA brandon = new RA("Brandon", DayOfWeek.MONDAY);
        RA sanjana = new RA("Sanjana", DayOfWeek.WEDNESDAY);
        may.addRAToDate(LocalDate.of(2023, 5, 13), brandon, false);
        may.addRAToDate(LocalDate.of(2023, 5, 13), sanjana, false);
        System.out.println("Done.");
    }
}
