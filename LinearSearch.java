class LinearSearch{
    public static  int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {1,3,45,78,90,5,12,34};
        int key = 1;
        int result;
        result = linearSearch(number,key);
        if(result == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Element found at index "+result);
        }
    }
}
    
