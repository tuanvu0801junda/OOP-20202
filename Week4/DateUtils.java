package Week4;
import static java.lang.Character.isDigit;


public class DateUtils {
    //method to compare 2 Dates.
    //return 1 --> after bigger || return -1 --> before bigger
    public static int compare2Dates(MyDate Da0, MyDate Da1){
        if(Da0.getYear() > Da1.getYear()) return -1;
        else if (Da0.getYear() < Da1.getYear()) return 1;
        else{
            if(Da0.getMonth() > Da1.getMonth()) return -1;
            else if (Da0.getMonth() < Da1.getMonth()) return 1;
            else{
                if(Da0.getDay() > Da1.getDay()) return -1;
                else if (Da0.getDay() < Da1.getDay()) return 1;
                else return 0;
            }
        }
    }

    public static void swap2Dates(MyDate[] dates, int id1, int id2){
        MyDate temp = dates[id1];
        dates[id1] = dates[id2];
        dates[id2] = temp;
    }

    public static int partition(MyDate[] dates, int left, int right){
        int begin = left;
        int end = right+1;
        MyDate pivot = dates[left];

        while (true) {
            begin++;
            while (begin<=right && compare2Dates(dates[begin],pivot) == 1) {
                begin++;
            }
            end--;
            while (end >= left && compare2Dates(dates[end],pivot) == -1) {
                end--;
            }
            if (begin >= end) break;
            else swap2Dates(dates, begin, end);
        }
        swap2Dates(dates, end, left);
        return end;
    }
    //method to sort a number of Dates.
    public static void quickSortDates(MyDate[] dates, int left, int right){
        if(left < right){
            int partitionPoint = partition(dates,left,right);
            quickSortDates(dates, left, partitionPoint-1);
            quickSortDates(dates,partitionPoint+1,right);
        }
    }

    public static void printDates(MyDate[] dates){
        for(int i=0;i<dates.length;i++){
            System.out.print(dates[i].getMonth()+"-");
            System.out.print(dates[i].getDay()+"-");
            System.out.print(dates[i].getYear()+"\n");
        }
    }
    public static boolean isWholeStringNum(String str){
        char[] chr = str.toCharArray();
        for(int i=0;i<chr.length;i++){
            if(!isDigit(chr[i])) return false;
        }
        return true;
    }

    public static boolean checkYearMonthValid(int day, int month, int year){
        if(month > 12 || month <0 ) return false;
        else if(year < 1950) return false;
        else if(day > 31 || day <0) return false;
        else return true;
    }
}
