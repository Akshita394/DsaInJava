public class StairCaseSearch {
    public static boolean stairCaseSearch1(int matrix[][],int key){
        //time complexity  = O(m+n)
        int row = 0;
        int col = matrix[0].length-1;
        while(row <matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("found key at "+row+","+col);
                return true;
            }
            else if(matrix[row][col] <  key){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static boolean stairCaseSearch2(int matrix[][] ,int key){
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        while(row > -1 && col > -1){
            if (matrix[row][col] == key){
                System.out.println("found key at "+row+","+col);
                return true;
            }
            else if(matrix[row-1][col] > key  ){
                row--;
            }
            else if(matrix[row][col-1] < key){
                col--;
            } 
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] ={{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};
        int key = 10;
        //stairCaseSearch1(matrix,key);
        stairCaseSearch2(matrix,key);
       
    }  
}
