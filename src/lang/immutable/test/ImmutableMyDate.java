package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private int month;
    private int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate(int year) {
        this.year = year;
    }


    public ImmutableMyDate setYear(int year) {
        return new ImmutableMyDate(year);
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
