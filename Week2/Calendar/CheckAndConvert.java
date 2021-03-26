package Week2.Calendar;

import static java.lang.Character.isDigit;

public class CheckAndConvert {

    public static int is_belong (String[] arr, String month_str){
        int month = 0;
        //str1.equals(str2) --> compare value || "==" --> compare "reference"
        for(int i=0;i<arr.length;i++){
            if (month_str.equals(arr[i])) { month = i + 1; break; }
        }
        return month;
    }

    public static int convert_month(String month_str){
        int month = 0; int control = 0;
        String[] valid1 = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] valid2 = {"Jan.","Feb.","Mar.","Apr.","May","June","July","Aug.","Sep.","Oct.","Nov.","Dec."};
        String[] valid3 = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        char[] month_c = month_str.toCharArray(); //-->convert string to char array
        for(char c: month_c){ if(!isDigit(c)){ control = 1;break;} }
        if (control == 0) {month = Integer.parseInt(month_str);}

        if(control == 1) { //if the month_str is a string
            month = is_belong(valid1,month_str);
            if (month == 0) { month = is_belong(valid2,month_str); }
            if(month == 0) { month = is_belong(valid3,month_str);}
        }
        return month;
    }

    //public static int convert_year(String year_str){ }
}
