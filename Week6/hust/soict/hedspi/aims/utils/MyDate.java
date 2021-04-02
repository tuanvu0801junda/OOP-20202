package Week6.hust.soict.hedspi.aims.utils;
import static Week6.hust.soict.hedspi.aims.utils.DateUtils.checkYearMonthValid;

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
        int control = 0, dayFinal = 0;
        String[] month_str = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        for(int i=0;i<month_str.length;i++){
            if(month_str[i].equals(month)) {setMonth(i+1);break;}
        }

        String[] dayLessThan10 = {"first","second","third","fourth","fifth","sixth",
                "seventh","eighth", "ninth"}; //index + 1
        String[] dayFrom10To20 = {"tenth","eleventh","twelfth","thirteenth","fourteenth","fifteenth","sixteenth",
        "seventeenth","eighteenth","nineteenth","twentieth"}; //index + 10

        String[] dayArray = day.split(" ");
        if (dayArray.length == 1){
            for (int i=0;i<dayLessThan10.length;i++){
                if(dayLessThan10[i].equals(day)) {setDay(i+1);control = 1;break;}
            }
            if(control == 0) {
                for (int i = 0; i < dayFrom10To20.length; i++) {
                    if (dayFrom10To20[i].equals(day)) { setDay(i+10);break; }
                }
            }
        }
        else{
            if(dayArray[0].equals("twenty")){dayFinal = 20;}
            else if (dayArray[0].equals("thirty")){dayFinal = 30;}
            for (int i=0;i<dayLessThan10.length;i++) {
                if (dayLessThan10[i].equals(dayArray[1])) {
                    dayFinal += (i + 1);
                    setDay(dayFinal);
                }
            }
        }

        ///*
        String[] yearArray = year.split(" ");
        int yearFinal = 0;
        if(yearArray[0].equals("nineteen")){ yearFinal = 1900; }
        if(yearArray[0].equals("twenty")){ yearFinal = 2000;}

        if(yearArray.length == 2){
            String[] yearStr = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
            "seventeen","eighteen","nineteen"};
            for(int i=0;i<yearStr.length;i++){
                if(yearArray[1].equals(yearStr[i])) {yearFinal += (i+10);}
            }

            String[] yearTen = {"oh","twenty","thirty","forty","fifty","sixty",
                    "seventy","eighty","ninety"};
            for(int i=1;i<yearTen.length;i++){
                if(yearArray[1].equals(yearTen[i])){yearFinal += (i+1)*10;}
            }
        }

        if(yearArray.length == 3){
            String[] yearTen = {"oh","twenty","thirty","forty","fifty","sixty",
                    "seventy","eighty","ninety"};
            for(int i=1;i<yearTen.length;i++){
                if(yearArray[1].equals(yearTen[i])){yearFinal += (i+1)*10;}
            }

            String[] unit = {"one","two","three","four","five","six","seven","eight","nine"};
            for(int i=0;i<unit.length;i++){
                if(yearArray[2].equals(unit[i])){yearFinal += (i+1);}
            }
        }

        setYear(yearFinal);
        //setYear(Integer.parseInt(year));


        /*
        if (isWholeStringNum(day) && isWholeStringNum(month) && isWholeStringNum(year)) {
            setDay(Integer.parseInt(day));
            setMonth(Integer.parseInt(month));
            setYear(Integer.parseInt(year));
        } else {
            System.out.println("Cannot initiate day,month and year! ");
        }*/
    }

    public String OrderDateToString() {
        String dateFinal = "";
        if (!checkYearMonthValid(day,month, year)) {
            return "Invalid month and year!";
        } else {
            String[] month_str = {"January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "October", "November", "December"};
            for (int i = 0; i < month_str.length; i++) {
                if (month == (i+1)) {dateFinal += month_str[i];break;}
            }
            switch (day) {
                case 1:
                    dateFinal += " 1st ";
                    break;
                case 2:
                    dateFinal += " 2nd ";
                    break;
                case 3:
                    dateFinal += " 3rd ";
                    break;
                default:
                    dateFinal += " "+day+"th ";
            }
            dateFinal += year+"\n";
        }
        return dateFinal;
    }
    //--> return string is better !! In ra BUFFER, in ra FILE, in ra SCREEN của APP cũng tiện lợi hơn.
    //sout <--> Chỉ in ra màn hình.

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

