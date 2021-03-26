package Week2;
public class FuncTest {
    public static void main(String[] args) {
        MyFunc mf = new MyFunc();
        mf.setYear(2000);
        mf.setMonth(6);
        System.out.println(mf.days_of_month());

        mf.setMonth(7);
        System.out.println(mf.days_of_month());

        mf.setMonth(8);
        System.out.println(mf.days_of_month());

        mf.setMonth(9);
        System.out.println(mf.days_of_month());
    }
}
