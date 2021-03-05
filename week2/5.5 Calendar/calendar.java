public class calendar {
    private int year,month;

    public void setYear(int year){this.year = year;}
    public void setMonth(int month){this.month = month;}

    public boolean is_valid(){
        if(month > 12 || month < 1) return false;
        else if(year < 0) return false;
        else return true;
    }

    /*
    public int days_of_month1(){
        if(!is_valid()) System.out.println("Invalid month or year!");
        else{
            int day = 0;
            if(month == 2){
                if(year%4 == 0){
                    if(year%100 == 0 && year%400 !=0) day = 28;
                    else day = 29;
                }
            }
            int[] month_31 = {1,3,5,7,8,10,12};
            int[] month_30 = {4,6,9,11};
            for(int i=0;i<month_31.length;i++){
                if(month == i) {
                    day = 31;
                    break;
                }
            }
            for (int i=0;i<month_30.length;i++){
                if(month == i) {
                    day = 30;
                    break;
                }
            }
        }
        return day;
    }
    */

    public void days_of_month(){
        if(!is_valid()) System.out.println("Invalid month or year!");
        else{
            if(month == 2){
                if(year%4 == 0){
                    if(year%100 == 0 && year%400 !=0) System.out.println("28 days");
                    else System.out.println("29 days");
                }
            }
            int[] month_31 = {1,3,5,7,8,10,12};
            int[] month_30 = {4,6,9,11};
            for(int i=0;i<month_31.length;i++){
                if(month == month_31[i]) {
                    System.out.println("31 days");
                    break;
                }}
            for (int i=0;i<month_30.length;i++){
                if(month == month_30[i]) {
                    System.out.println("30 days");
                    break;
                }}
        }
    }
}
