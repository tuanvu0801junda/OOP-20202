import javax.swing.*;

public class ShowTwoNumber {
    public static void main(String[] args) {
        String StrNum1,StrNum2;
        String Notification = "You've just entered: ";

        StrNum1 = JOptionPane.showInputDialog("Input 1st number: ",JOptionPane.INFORMATION_MESSAGE);
        Notification += StrNum1 + " and ";

        StrNum2 = JOptionPane.showInputDialog("Input 2nd number: ",JOptionPane.INFORMATION_MESSAGE);
        Notification += StrNum2;

        JOptionPane.showMessageDialog(null,Notification);
        System.exit(0);
    }
}
