class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int sum=0;
            for(int k=i+1;k<numbers.length;k++){
            if(numbers[i]!=numbers[k]){
                sum=numbers[i]+numbers[k];
                if(sum==target){
                    return new int[]{i+1,k+1};
                }
            }
            }

        }
        return new int[]{-1,-1};
    }
}
