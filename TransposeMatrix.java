public class TransposeMatrix {
   public static void printMatrix(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
   } 
   public static void transpose(int arr[][]){

        int row = arr.length;
        int col = arr[0].length;

        int trans[][] = new int[col][row];
        for(int  i = 0 ;i<col;i++){
            for(int j = 0 ; j<row;j++){
                trans[i][j] = arr[j][i];
            }
        }
        printMatrix(trans);
    }
   

  public static void main(String[] args) {
    int [][]arr = {{1,2,3},{4,5,6}};
    printMatrix(arr);
    System.out.println("After transposing");
    transpose(arr);
  }  
}
