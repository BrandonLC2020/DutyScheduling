import java.time.LocalDate;
import java.util.ArrayList;

public class Analyzer {
    public static ArrayList<LocalDate> holidays;

    public ArrayList<RA> allRAs;
    int numRAs;

    public Analyzer() {
        numRAs = 0;
        allRAs = new ArrayList<RA>();
        holidays = new ArrayList<LocalDate>();
        fillHolidays();
    }

    private void fillHolidays() {
        LocalDate[] temp = new LocalDate[]{LocalDate.of(2023, 1, 4),
                LocalDate.of(2023, 1, 13), LocalDate.of(2023, 1, 14),
                LocalDate.of(2023, 1, 15), LocalDate.of(2023, 3, 10),
                LocalDate.of(2023, 3, 11), LocalDate.of(2023, 3, 12),
                LocalDate.of(2023, 3, 13), LocalDate.of(2023, 3, 14),
                LocalDate.of(2023, 3, 15), LocalDate.of(2023, 3, 16),
                LocalDate.of(2023, 3, 17), LocalDate.of(2023, 3, 18),
                LocalDate.of(2023, 5, 7), LocalDate.of(2023, 5, 8),
                LocalDate.of(2023, 5, 9), LocalDate.of(2023, 5, 10),
                LocalDate.of(2023, 5, 11), LocalDate.of(2023, 5, 12),
                LocalDate.of(2023, 5, 13), LocalDate.of(2023, 5, 14)};
        for (int i = 0; i < temp.length; i++) {
            holidays.add(temp[i]);
        }
    }


}
