package OOP_week2.MyMatrix;
import java.util.Scanner;

public class MyMatrix {
    public int column_of_matrix(int[][] arr){ return arr[0].length; }
    public int row_of_matrix(int[][] arr){ return arr.length; }

    public void print_add_result(int[][] arr1, int[][] arr2){
        System.out.println("\nThe result of 2 matrix addition");
        for (int i=0;i<arr1.length;i++){
            for(int k=0;k<arr1[0].length;k++){
                System.out.print(arr1[i][k] + arr2[i][k]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    public void print_matrix(int[][] arr, String name){
        System.out.println("\nThe "+name);
        for (int i=0;i<arr.length;i++){
            for(int k=0;k<arr[0].length;k++){
                System.out.print(arr[i][k]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    public static int[][] input_matrix(int row, int column, Scanner scan, String name) {
        int[][] matrix = new int[row][column];
        //datatype[][] array_name = new datatype[num_of_row][num_of_column]; --> initialize
        System.out.println("\nEnter elements of " + name);
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                System.out.print("matrix[" + (i + 1) + "][" + (k + 1) + "] = ");
                matrix[i][k] = scan.nextInt();
            }
        }
        return matrix;
    }
}
