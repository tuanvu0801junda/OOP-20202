package Week4;

public class MyDate {
    private String day,month,year;

    public String getDay() { return day; }
    public String getMonth() { return month; }
    public String getYear() { return year; }

    public void setDay(String day) { this.day = day; }
    public void setMonth(String month) { this.month = month; }
    public void setYear(String year) { this.year = year; }

    public MyDate(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
