class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len;
        int minl=Integer.MAX_VALUE;
        String str="";
        //minimum length-> maximum prefix length
        for(int i=0;i<strs.length;i++){
            len=strs[i].length();
            if(len<minl){
                minl=len;
            }
        }
        //check for prefixx
        for(int i=0;i<minl;i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(ch!=strs[j].charAt(i)){
                    // str=str+ch;
                    return str;
                }
            }
            str=str+ch;
        }
        return str;

    }
}