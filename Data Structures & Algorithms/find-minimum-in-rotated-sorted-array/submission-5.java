class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];
        int l=0;
        int r=nums.length-1;
        int min=Integer.MAX_VALUE;
        while (l < r) {
    int mid = l + (r - l) / 2;

    if (nums[mid] > nums[r])
        l = mid + 1;
    else
        r = mid;
}
return nums[l];
        // while(l<=r){
        //     int mid=(l+r)/2;
        //     if(nums[l]<=nums[mid]){
        //      min=Math.min(min,nums[l]);
        //      l=mid+1;
        //     }
        //     else{
        //         r=mid-1;
        //         min=Math.min(min,nums[mid]);
        //     }
            
        // }
        // return min;
    }

}
