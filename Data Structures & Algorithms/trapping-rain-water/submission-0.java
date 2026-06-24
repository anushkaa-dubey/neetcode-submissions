class Solution {
    public int trap(int[] height) {
     int water=0;
     for(int i=0;i<height.length;i++){
        int mhl=height[i];
        for(int l=0;l<=i;l++){
            mhl=Math.max(mhl,height[l]);
        }
        int mhr=height[i];
        for(int r=i;r<height.length;r++){
          mhr=Math.max(mhr,height[r]);
        }
        water+=Math.min(mhr,mhl)-height[i]; 
     }   
     return water;
    }
}
