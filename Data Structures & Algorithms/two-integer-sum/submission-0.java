class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            int sum=nums[i]+nums[j];
            if(sum==target){
                int[]index= {i,j};
                return index;
            }
            }   
         }
         int[] i={0,0};
         return i;
    }
}
