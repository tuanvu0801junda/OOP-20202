package Week2;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        //read until meet character '\n' --> DEFAULT: String

        System.out.println("How old are your?");
        int age = keyboard.nextInt();

        System.out.println("How tall are you?");
        double height = keyboard.nextDouble();

        System.out.println("So, your name is "+strName+" and your are "+age+" years old." +
                " Your height is "+height+" cm tall");

    }
}
