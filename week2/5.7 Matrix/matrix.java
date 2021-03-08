public class matrix {
    public int row;
    public int column;

    public void setRow(int row){ this.row = row; }
    public void setColumn(int column){this.column = column;}

    public void print_add_result(int[][] arr1, int[][] arr2){
        System.out.println("\nThe result of 2 matrix addition");
        for (int i=0;i<row;i++){
            for(int k=0;k<column;k++){
                System.out.print(arr1[i][k] + arr2[i][k]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    public void print_matrix(int[][] arr, String name){
        System.out.println("\nThe "+name);
        for (int i=0;i<row;i++){
            for(int k=0;k<column;k++){
                System.out.print(arr[i][k]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
