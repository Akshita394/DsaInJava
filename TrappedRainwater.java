public class TrappedRainwater {
    public static int trappedrainwater(int height[]){
        int n = height.length;
        // left maximum boundry
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i =1;i<n;i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // right max boundry
        int rigthMax[] = new int[n];
        rigthMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--)
        {
            rigthMax[i] = Math.max(height[i],rigthMax[i+1]);
        } 
        int trappedwater = 0;
        int waterlevel = 0;
        //loop
        for(int i =0;i<n;i++){
            //waterlevel = min(leftmax,rightmax) 
            waterlevel = Math.min(leftMax[i],rigthMax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
   public static void main(String[] args){
     int heigth[] = {4,2,0,6,3,2,5};
     int trappedwater = trappedrainwater(heigth);
     System.out.println("TrappedRainwater = "+trappedwater );

   } 
}
