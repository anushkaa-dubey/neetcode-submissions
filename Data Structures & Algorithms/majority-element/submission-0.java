class Solution {
    public int majorityElement(int[] nums) {
       int freq=0;
       for(int i=0;i<nums.length;i++){
        int n=nums[i];
         for(int j=i;j<nums.length;j++){
          if(nums[j]==n){
            freq++;
          }
          if(freq>nums.length/2){
            return n;
          }      
         }
       } 
       return 0;
    }
}