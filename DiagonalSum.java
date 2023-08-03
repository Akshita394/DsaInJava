public class DiagonalSum {
    public static void diagonalSum(int matrix[][]){
        int sum = 0;
        for(int  i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j == (matrix.length-1) && i!=j){
                    sum += matrix[i][j];
                }
            }
        }
        
        System.out.println("diagonals sum = "+sum);
    }
    public static void diagonalSumO(int matrix[][]){
        int sum  = 0;
        for(int i = 0;i<matrix.length;i++){
            sum += matrix[i][i];//pd where (r,c) r==c
            if(i!=matrix.length-1-i)
                sum += matrix[i][matrix.length-i-1];//i+j = n-1 => j = n-i-1  n= matrix length
        }
        System.out.println("diagonals sum = "+sum);
    }
    public static void main(String[] args) {
    int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //diagonalSum(matrix);
    diagonalSumO(matrix);    
    }
    
}
