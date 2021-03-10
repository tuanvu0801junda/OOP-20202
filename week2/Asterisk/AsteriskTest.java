package OOP_week2.Asterisk;
import java.util.Scanner;

public class AsteriskTest {
    public static void main(String[] args) {
        Asterisk star = new Asterisk();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        int line = scan.nextInt();
        star.setLine(line);
        star.print_asterisk();
    }
}
