import java.util.Scanner;

public class matrix_test {
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
            //int[][] matrix = new int[row][column];
            //datatype[][] array_name = new datatype[num_of_row][num_of_column]; --> initialize

            int[][] matrix1 = input_matrix(row,column,scan,"matrix1");
            int[][] matrix2 = input_matrix(row,column,scan,"matrix2");

            matrix mtx = new matrix();
            mtx.setColumn(column);
            mtx.setRow(row);
            mtx.print_matrix(matrix1,row,column,"matrix1");
            mtx.print_matrix(matrix2,row,column,"matrix2");
            mtx.print_add_result(matrix1,matrix2,row,column);
        }
    }

    public static int[][] input_matrix(int column, int row, Scanner scan, String name){
        int[][] matrix = new int[row][column];
        System.out.println("\nEnter elements of "+name);
        for (int i=0;i<row;i++){
            for(int k=0;k<column;k++){
                System.out.print("matrix[" + (i+1) + "][" + (k+1) + "] = ");
                matrix[i][k] = scan.nextInt();
            }
        }
        return matrix;
    }

}
