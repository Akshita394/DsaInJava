public class PrintPairs {
    public static void printPairs(int numbers[]) {
        int tp=0;;
        for(int indx = 0 ;indx<numbers.length;indx++){
            for(int indx2 = indx+1;indx2<numbers.length;indx2++){
                
                System.out.print("("+numbers[indx]+","+numbers[indx2]+") ");
                tp++;
                
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+tp);//to calculate pair (n(n-1))/2
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,16,45};
        printPairs(numbers);
        
    }
}
