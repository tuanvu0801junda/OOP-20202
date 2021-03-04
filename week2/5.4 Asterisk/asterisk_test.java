import java.util.Scanner;

public class asterisk_test {
    public static void main(String[] args) {
        asterisk star = new asterisk();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        int line = scan.nextInt();
        star.setLine(line);
        star.print_asterisk();
    }
}
