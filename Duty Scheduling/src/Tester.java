import java.time.DayOfWeek;
import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        Analyzer testAnalyzer = new Analyzer();
        MonthOfDuty january = new MonthOfDuty("January", 2023);
        MonthOfDuty may = new MonthOfDuty("May", 2023);
        RA brandon = new RA("Brandon", DayOfWeek.MONDAY);
        RA kori = new RA("Kori", DayOfWeek.TUESDAY);
        may.addRAToDate(LocalDate.of(2023, 5, 13), brandon, false);
        may.addRAToDate(LocalDate.of(2023, 5, 13), kori, false);
        System.out.println("Done.");
    }
}
