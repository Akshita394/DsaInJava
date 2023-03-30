
import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        Arrays.sort(arr);
        int start = 0,end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2; 
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        int number[] = {2,4,6,-1,78,34,19};

        int key = 2;
        int result = binarySearch(number, key);
        System.out.println(result);
        if(result == -1){
            System.out.println("Not found");
        } 
        else{
            System.out.println("Key found at index "+result);
        }
    }    
}
