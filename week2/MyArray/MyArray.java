package OOP_week2.MyArray;
import java.util.Arrays;

public class MyArray {
    public void print_array(int[] arr){
        System.out.println("List of elements in array:");
        for(int i=0;i<arr.length;i++){
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        System.out.print("\n");
    }

    public int calculate_sum(int[] arr){
        int sum = 0;
        for (int i =0;i<arr.length;i++) sum += arr[i];
        return sum;
    }

    public void print_sum(int[] arr){
        System.out.println("Sum of elements in array: "+calculate_sum(arr)+"\n");
    }

    public void print_average(int[] arr){
        int sum = calculate_sum(arr);
        System.out.println("Average of elements in array: "+ (double)sum/arr.length +"\n");
    }

    public void print_sorted_array(int[] arr){
        Arrays.sort(arr); //--> used to sort an array
        System.out.println("Array after being sorted: ");
        print_array(arr);
    }
}
