package OOP_week2.Asterisk;
public class Asterisk {
        private int line;

        public void setLine(int line){this.line = line;}

        public void print_asterisk() {
            for (int i = 1; i <= line; i++) {
                for (int j = 1; j <= line - i; j++) System.out.print(" ");
                for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
                for (int j = 1; j <= line - i; j++) System.out.print(" ");
                System.out.println("\n");
                //println --> xuống dòng
                //print --> không xuống dòng
            }
        }
}
