class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[]=new int[256];
        Arrays.fill(hash,-1);
        int n=s.length();
        int l=0,r=0,maxl=0;
         while(r<n){
            char ch=s.charAt(r);
            if(hash[ch]!=-1 && hash[ch]>=l){
                    l=hash[ch]+1;
            }

            int len=r-l+1;
            maxl=Math.max(len,maxl);
            hash[ch]=r;
            r++;
         }
         return maxl;
    }
}
