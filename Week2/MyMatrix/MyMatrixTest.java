package Week2.MyMatrix;
import java.util.Scanner;
import static Week2.MyMatrix.MyMatrix.input_matrix; //import method without an instance

public class MyMatrixTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int column = scan.nextInt();
        if(row <=0 || column <=0){
            System.out.println("Re-input column or row");
        }
        else{
            int[][] matrix1 = input_matrix(row,column,scan,"matrix 1");
            int[][] matrix2 = input_matrix(row,column,scan,"matrix 2");
            //Dùng method không thông qua "instance" --> buộc phải dùng "STATIC"

            MyMatrix mtx = new MyMatrix(); //instance
            mtx.print_matrix(matrix1,"matrix 1");
            mtx.print_matrix(matrix2,"matrix 2");
            mtx.print_add_result(matrix1,matrix2);
            System.out.println("Number of row: "+mtx.row_of_matrix(matrix1));
            System.out.println("Number of column: "+mtx.column_of_matrix(matrix1));
        }
    }
}
