public class array_sum_avg {
    private int num;
    public void setNum(int num){this.num = num;}

    public void print_array(int[] arr){
        System.out.println("List of elements in array:");
        for(int i=0;i<num;i++){
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        System.out.print("\n");
    }
    public int calculate_sum(int[] arr){
        int sum = 0;
        for (int i=0;i<num;i++) sum += arr[i];
        return sum;
    }

    public double calculate_avg(int[] arr){
        int sum1 = calculate_sum(arr);
        return (double) sum1/num;
    }

    public void print_sum(int[] arr){
        System.out.println("Sum of elements in array: "+calculate_sum(arr)+"\n");
    }

    public void print_average(int[] arr){
        System.out.println("Average of elements in array: "+calculate_avg(arr)+"\n");
    }
}
