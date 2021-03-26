package Week2.Calendar;
public class Calendar {
    private int year, month;

    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    //truy cập được nếu là "private"

    public boolean is_valid() {
        if (month > 12 || month < 1) return false;
        else if (year < 0) return false;
        else return true;
    }

    public void days_of_month() {
        if (!is_valid()) System.out.println("Invalid month or year!");
        else {
            if (month == 2) {
                if (year % 4 == 0) {
                    if (year % 100 == 0 && year % 400 != 0) {System.out.println("28 days");}
                    else {System.out.println("29 days");}
                } else { System.out.println("28 days"); }
            } else {
                int[] month_31 = {1, 3, 5, 7, 8, 10, 12};
                int control = 0;
                for (int i = 0; i < month_31.length; i++) {
                    if (month == month_31[i]) {
                        System.out.println("31 days");
                        control = 1;
                        break;
                    }
                }
                if (control == 0) System.out.println("30 days");
            }
        }
    }
}