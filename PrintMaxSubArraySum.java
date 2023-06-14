public class PrintMaxSubArraySum{
    public static void printMaxSubArraySum(int numbers[]) {
        int cursum = 0;
        int maxSum = Integer.MIN_VALUE; 

        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                cursum = 0;
                for(int k = i;k<=j;k++){
                   cursum += numbers[k];
                }
                if(maxSum < cursum)
                {
                    maxSum = cursum;
                }
                
            }
            
        } 
        System.out.println("Max Sum = "+maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {4,6,18,1,23};
        printMaxSubArraySum(numbers);
    }
}