package Week7.hust.soict.hedspi.aims.utils;
//import static Week4.DateUtils.compare2Dates;

import static Week7.hust.soict.hedspi.aims.utils.DateUtils.printDates;
import static Week7.hust.soict.hedspi.aims.utils.DateUtils.quickSortDates;

public class DateTest {
    public static void main(String[] args) {
        MyDate md = new MyDate(23,3,2013);
        System.out.println(md.OrderDateToString());
        md.printMyFormat();

        MyDate md1 = new MyDate(28,9,2008);
        /*
        int result = compare2Dates(md,md1);
        if(result == 1) System.out.println("md1 is after md");
        else if(result == -1) System.out.println("md1 if before md");
        else System.out.println("md is the same as md1");
        */

        MyDate[] mds = new MyDate[5];
        mds[0] = new MyDate(3,7,2020);
        mds[1] = new MyDate(4,1,2021);
        mds[2] = new MyDate(6,8,1999);
        mds[3] = new MyDate(7,11,2020);
        mds[4] = new MyDate(9,12,2011);

        System.out.println("Before");
        printDates(mds);
        quickSortDates(mds,0,4);
        System.out.println("\nAfter");
        printDates(mds);

        MyDate mdmd = new MyDate("nineteenth","January","nineteen ninety seven");
        System.out.println("\n"+mdmd.getDay() + " " + mdmd.getMonth() + " " + mdmd.getYear());


    }
}
