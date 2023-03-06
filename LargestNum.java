public class LargestNum {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;// - infinity
        for(int i=0;i<number.length;i++){
            if(number[i]>largest){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int number[] = {72,81,67,23,1,56,78};
        int largest = getLargest(number);
        System.out.println("The largest number in given array is "+largest);
    }

}
