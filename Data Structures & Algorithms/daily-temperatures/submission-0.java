class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Stack<Integer> st=new Stack<>();
        int nge[]=new int[temperatures.length];
        // int max=0;
        for(int i=0;i<temperatures.length;i++){
        //  max=i;
         for(int j=i+1;j<temperatures.length;j++){
            if(temperatures[j]>temperatures[i]){
                nge[i]=j-i;
                // nge[i]=temperatures[j];
                break;
            }
         }
        }
        return nge;
    }
}
