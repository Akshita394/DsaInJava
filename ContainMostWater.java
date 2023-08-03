class ContainMostWater {
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int lh = height[l];
            int rh = height[r];
            int mh = Math.min(lh,rh);
            max = Math.max(max,mh*(r-l));
            if(lh< rh )
            l++;
            else
            r--;
        }
   
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 3,8,6,7,5,4,8,1};
        int res = maxArea(arr);
        System.out.println(res);
    }
}
