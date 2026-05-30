class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int j=s.length()-1;
        for(int i=0;i<j;i++){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
