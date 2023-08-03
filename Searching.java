public class Searching {
    public static int serachNum(int matrix[][],int target){
        int count = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
               if(matrix[i][j] == target){ 
                    count++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
    int [][] arr = {{4,7,8},{8,8,7}};
    int result = serachNum(arr,7);
    System.out.println(result);
    }
}
