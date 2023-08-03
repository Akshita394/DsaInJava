public class Sorting {
    public static void selectionSort(int arr[]){
        // O(n^2)
        for(int  i = 0;i<arr.length-1;i++){
            int minpos = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }    
    }
    public static void insertion(int arr[]){
        // O(n^2)
        for(int  i=1; i<arr.length ;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0  && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }        
            arr[prev+1] = curr;
        }    
    }
    public static void countingSort(int arr[]){
        //O(n+range)
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }


        int count[] = new int[largest+1];
        for(int  i= 0;i<arr.length;i++){
            count[arr[i]]++;
        } 
        
        //sorting
        int j = 0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static  void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
   public static void main(String args[]){
        int arr[] = {5,4,1,2,3,1,7,8,6,50,41,67,31};
        //selectionSort(arr);
        insertion(arr);
        //countingSort(arr);
        printArr(arr);        
    }
}
