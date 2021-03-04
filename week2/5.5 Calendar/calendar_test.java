import java.util.Scanner;

public class calendar_test {
    public static void main(String[] args) {
        int month = 0;
        String[] valid1 = {"Jan","Feb","Mar","Apr","May","Jun\n","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] valid2 = {"Jan.","Feb.","Mar.","Apr.","May","June","July","Aug.","Sep.","Oct.","Nov.","Dec."};
        Scanner scan = new Scanner(System.in);
        System.out.print("Input month: ");
        String month_str = scan.nextLine();
        String month_m = month_str.toString();
        System.out.print("Input year: ");
        String year_str = scan.nextLine();
        System.out.println("month_m = "+month_m);
        System.out.println("year_str = "+year_str);
        int year = Integer.parseInt(year_str);
        System.out.println("year = "+year);

        System.out.println(month_str == "Jan\n");
        System.out.println(month_m == "Jan");
        for(int i=0;i<valid1.length;i++) {
            System.out.print(valid1[i]);
            if(valid1[i] == month_str) {month = i+1;break;}
        }
        if(month == 0){
        for(int i=0;i<valid2.length;i++) {
            if(valid2[i] == month_str) {month = i+1;break;}
        }}
        if(month == 0) System.out.println("Invalid month or year!");
        else {
            calendar reki = new calendar();
            reki.setMonth(month);
            reki.setYear(year);
            System.out.print("Days of month: ");
            reki.days_of_month();
        }
    }
}
