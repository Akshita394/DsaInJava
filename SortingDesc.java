public class SortingDesc {
    public static void bubbleSort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int  j = i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
    public static void insertion(int arr[]){

         for(int  i=1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0  && arr[prev] <  curr){
                arr[prev+1] = arr[prev];
                prev--;
            }        
            arr[prev+1] = curr;
        } 
        
    }
    
    public static void selectionSort(int arr[]){
        // O(n^2)
        for(int  i = 0;i<arr.length-1;i++){
            int maxpos = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[maxpos] < arr[j]){
                    maxpos = j;
                }
            }
            //swap
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
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
        for(int i = count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void printArr(int arr[]){
        for(int  i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 8, 1, 3, 6, 7, 5, 4 };
        //bubbleSort(arr);
        //insertion(arr);
        //countingSort(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
