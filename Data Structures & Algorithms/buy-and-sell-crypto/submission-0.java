class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        // int buy=prices[0];
        int sell=prices[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
           sell=prices[i];
           for(int j=0;j<i;j++){
            min=Math.min(min,prices[j]);
            maxp=Math.max(maxp, prices[i]-min);
           }
           
        }
        return maxp;
    }
}
