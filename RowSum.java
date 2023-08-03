public class RowSum {
    public static int rowSum(int nums[][],int rowNo){
        int sum = 0;
        for(int i =0;i<nums[0].length;i++){
            sum += nums[rowNo-1][i];   
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] nums = {{1,4,9},{11,4,3},{2,2,3}};
        int result = rowSum(nums,2);
        System.out.println(result);
    }
    
}
