package Week4;
import static Week4.DateUtils.checkYearMonthValid;
import static Week4.DateUtils.isWholeStringNum;

public class MyDate {
    private int day, month, year;

    public int getDay() { return day; }
    public int getMonth() { return month;}
    public int getYear() { return year; }

    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }

    public MyDate(int day, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //twenty nineteen --> 2019. twenty twenty --> 2020. twenty twenty one --> 2021.
    //twentieth --> 20th, twenty eighth --> 28th
    public MyDate(String day, String month, String year) {
        super();
        if (isWholeStringNum(day) && isWholeStringNum(month) && isWholeStringNum(year)) {
            setDay(Integer.parseInt(day));
            setMonth(Integer.parseInt(month));
            setYear(Integer.parseInt(year));
        } else {
            System.out.println("Cannot initiate day,month and year! ");
        }
    }

    public void print() {
        if (!checkYearMonthValid(day,month, year)) {
            System.out.println("Invalid month and year!");
        } else {
            String[] month_str = {"January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "October", "November", "December"};
            for (int i = 0; i < month_str.length; i++) {
                if (month == (i+1)) {System.out.print(month_str[i]);break;}
            }
            switch (day) {
                case 1:
                    System.out.print(" 1st ");
                    break;
                case 2:
                    System.out.print(" 2nd ");
                    break;
                case 3:
                    System.out.print(" 3rd ");
                    break;
                default:
                    System.out.print(" "+day+"th ");
            }
            System.out.print(year+"\n");
        }
    }

    public void printMyFormat(){
        //Format: dd-MMM-yyyy
        if (!checkYearMonthValid(day,month,year)) {
            System.out.println("Invalid month and year!");
        } else {
            System.out.print(day);
            String[] month3 = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
            for(int i=0;i<month3.length;i++){
                if(month == (i+1)){
                    System.out.print("-"+month3[i]);break;
                }
            }
            System.out.print("-"+year+"\n");
        }
    }



}

