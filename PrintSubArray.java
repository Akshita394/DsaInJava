public class PrintSubArray {
    public static void printSubArray(int numbers[]) {
        int ts=0;
        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                int sum=0;
                for(int k = i;k<=j;k++){
                    sum = sum+numbers[k];
                    System.out.print(numbers[k]+" , ");
                }
                System.out.print(" sum = "+sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = "+ts);
    }
    public static void main(String args[]) {
        int numbers[]= {2,5,7,9,11,13};
        printSubArray(numbers);
    }
}
