package OOP_week2.Calendar;
import java.util.Scanner;
import static OOP_week2.Calendar.CheckAndConvert.convert_month;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input month: ");
        String month_str = scan.nextLine();
        System.out.print("Input year: ");
        int year = scan.nextInt();

        int month = convert_month(month_str);

        Calendar reki = new Calendar();
        reki.setMonth(month);
        reki.setYear(year);
        System.out.print("Days of month: ");
        reki.days_of_month();
    }
}
