package Week2.MyArray;
import java.util.Scanner;

public class MyArrayTest {
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

            MyArray asa = new MyArray();
            asa.print_array(arr);
            asa.print_sum(arr);
            asa.print_average(arr);
            asa.print_sorted_array(arr);
        }
    }

}
