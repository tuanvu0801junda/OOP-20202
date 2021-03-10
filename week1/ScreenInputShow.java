package OOP_week1;
import javax.swing.*;

public class ScreenInputShow {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null,"Input your name: ");
        JOptionPane.showMessageDialog(null,"Hi, "+result+"!");
        System.exit(0);
    }
}
