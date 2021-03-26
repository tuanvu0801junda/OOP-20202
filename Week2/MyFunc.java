package Week2;
public class MyFunc {
    public int month;
    public int year;

    public void setYear(int year){this.year = year;}
    public void setMonth(int month){this.month = month;}

    public int days_of_month(){
            int day =0 ;
            if(month == 2){
                if(year%4 == 0){
                    if(year%100 == 0 && year%400 !=0) day = 28;
                    else day = 29;
                }
            }
            else {
                int[] month_31 = {1, 3, 5, 7, 8, 10, 12};
                for (int i = 0; i < month_31.length; i++) {
                    if (month == month_31[i]) {
                        day = 31;
                        break;
                    }
                }
                if(day != 31) day = 30;
                    /*int[] month_30 = {4, 6, 9, 11};
                    for (int i = 0; i < month_30.length; i++) {
                        if (month == month_30[i]) {
                            day = 30;
                            break;
                        }
                    }*/
                }
            return day;
        }
    }


