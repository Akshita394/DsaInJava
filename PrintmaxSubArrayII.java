public class PrintmaxSubArrayII {
public static void maxSubArraySum(int numbers[]) {
        int cursum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
         
        prefix[0] = numbers[0];
        for(int i = 1;i<numbers.length;i++)
        {
            prefix[i] = numbers[i]+prefix[i-1];
        } 

        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                cursum = 0;
                cursum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
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
        maxSubArraySum(numbers);
    }    
}
