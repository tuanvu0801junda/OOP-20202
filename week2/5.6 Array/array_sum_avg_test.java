import java.util.Arrays;
import java.util.Scanner;

public class array_sum_avg_test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        int num = scan.nextInt();
        if (num <= 0) System.out.println("Re-input a positive");
        else {
            int[] arr = new int[num];
            //datatype[] array_name = new datatype[size_of_array];
            System.out.println("Input the elements!");
            for (int i = 0; i < num; i++) {
                System.out.print("arr[" + i + "] = ");
                arr[i] = scan.nextInt();
            }

            array_sum_avg asa = new array_sum_avg();
            asa.setNum(num);
            asa.print_array(arr);
            asa.print_sum(arr);
            asa.print_average(arr);
            Arrays.sort(arr); //->method used to sort
            System.out.println("Array after being sorted: ");
            asa.print_array(arr);
        }
    }

}
