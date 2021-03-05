import java.util.Scanner;
import static java.lang.Character.isDigit;

public class calendar_test {
    public static void main(String[] args) {
        int month = 0; int control = 0;
        String[] valid1 = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] valid2 = {"Jan.","Feb.","Mar.","Apr.","May","June","July","Aug.","Sep.","Oct.","Nov.","Dec."};
        Scanner scan = new Scanner(System.in);
        System.out.print("Input month: ");
        String month_str = scan.nextLine();
        System.out.print("Input year: ");
        int year = scan.nextInt();

        char[] month_c = month_str.toCharArray(); //-->convert string to char array
        for(char c: month_c){
            if(!isDigit(c)){ control = 1;break;}
        }
        if (control == 0) {month = Integer.parseInt(month_str);}
        if(control == 1) { //if the month_str is a string
            for (int i = 0; i < valid1.length; i++) {
                if (month_str.equals(valid1[i])) {
                    month = i + 1; break;
                }}
            if (month == 0) {
                for (int i = 0; i < valid2.length; i++) {
                    if (month_str.equals(valid2[i])) {
                        month = i + 1; break;
                    }}
            }
        }
        //str1.equals(str2) --> compare value | "==" --> compare "reference"
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
