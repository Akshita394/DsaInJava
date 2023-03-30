public class ReverseArray {
    public static void traverseArray(int numbers[]){
        for(int indx =0;indx<numbers.length;indx++)
        {
            System.out.println(numbers[indx]);
        }
    }
    public static void reverseArray(int numbers[]){
        int first =0,last = numbers.length-1;
        
        while(first < last){
            int temp = numbers[first];
            numbers[first]= numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,9};
        System.out.println("Given Arra is: ");
        traverseArray(numbers);
        System.out.println("Reverse array");
        reverseArray(numbers);
        for(int indx =0;indx<numbers.length;indx++){
            System.out.println(numbers[indx]);
        }
    }
}
