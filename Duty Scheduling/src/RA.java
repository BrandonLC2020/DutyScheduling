public class RA {
    private String name;

    private int totalWeekdayDuty;
    private int totalWeekdayPrimaryDuty;
    private int totalWeekdaySecondaryDuty;

    private int totalWeekendDayDuty;
    private int totalWeekendDayPrimaryDuty;
    private int totalWeekendDaySecondaryDuty;

    private int totalWeekendNightDuty;
    private int totalWeekendNightPrimaryDuty;
    private int totalWeekendNightSecondaryDuty;

    private int totalHolidayDuty;

    public RA(String name) {
        this.name = name;
        this.totalWeekdayDuty = 0;
        this.totalWeekdayPrimaryDuty = 0;
        this.totalWeekdaySecondaryDuty = 0;

        this.totalWeekendDayDuty = 0;
        this.totalWeekendDayPrimaryDuty = 0;
        this.totalWeekendDaySecondaryDuty = 0;

        this.totalWeekendNightDuty = 0;
        this.totalWeekendNightPrimaryDuty = 0;
        this.totalWeekendNightSecondaryDuty = 0;
    }

    public int getTotalHolidayDuty() {
        return totalHolidayDuty;
    }

    public int getTotalWeekdayDuty() {
        return totalWeekdayDuty;
    }

    public int getTotalWeekdayPrimaryDuty() {
        return totalWeekdayPrimaryDuty;
    }

    public int getTotalWeekdaySecondaryDuty() {
        return totalWeekdaySecondaryDuty;
    }

    public int getTotalWeekendDayDuty() {
        return totalWeekendDayDuty;
    }

    public int getTotalWeekendDayPrimaryDuty() {
        return totalWeekendDayPrimaryDuty;
    }

    public int getTotalWeekendDaySecondaryDuty() {
        return totalWeekendDaySecondaryDuty;
    }

    public int getTotalWeekendNightDuty() {
        return totalWeekendNightDuty;
    }

    public int getTotalWeekendNightPrimaryDuty() {
        return totalWeekendNightPrimaryDuty;
    }

    public int getTotalWeekendNightSecondaryDuty() {
        return totalWeekendNightSecondaryDuty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalHolidayDuty(int totalHolidayDuty) {
        this.totalHolidayDuty = totalHolidayDuty;
    }

    public void setTotalWeekdayDuty(int totalWeekdayDuty) {
        this.totalWeekdayDuty = totalWeekdayDuty;
    }

    public void setTotalWeekdayPrimaryDuty(int totalWeekdayPrimaryDuty) {
        this.totalWeekdayPrimaryDuty = totalWeekdayPrimaryDuty;
    }

    public void setTotalWeekdaySecondaryDuty(int totalWeekdaySecondaryDuty) {
        this.totalWeekdaySecondaryDuty = totalWeekdaySecondaryDuty;
    }

    public void setTotalWeekendDayDuty(int totalWeekendDayDuty) {
        this.totalWeekendDayDuty = totalWeekendDayDuty;
    }

    public void setTotalWeekendDayPrimaryDuty(int totalWeekendDayPrimaryDuty) {
        this.totalWeekendDayPrimaryDuty = totalWeekendDayPrimaryDuty;
    }

    public void setTotalWeekendDaySecondaryDuty(int totalWeekendDaySecondaryDuty) {
        this.totalWeekendDaySecondaryDuty = totalWeekendDaySecondaryDuty;
    }

    public void setTotalWeekendNightDuty(int totalWeekendNightDuty) {
        this.totalWeekendNightDuty = totalWeekendNightDuty;
    }

    public void setTotalWeekendNightPrimaryDuty(int totalWeekendNightPrimaryDuty) {
        this.totalWeekendNightPrimaryDuty = totalWeekendNightPrimaryDuty;
    }

    public void setTotalWeekendNightSecondaryDuty(int totalWeekendNightSecondaryDuty) {
        this.totalWeekendNightSecondaryDuty = totalWeekendNightSecondaryDuty;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RA) {
            RA input = (RA) obj;
            String inputName = input.getName();
            return inputName.equals(this.getName());
        }
        return false;
    }
}