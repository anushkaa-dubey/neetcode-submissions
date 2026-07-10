class Solution {
    //hello world
    //5# hello  5# world

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
          sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        int i=0;
        List<String> res=new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int l=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+l);
            res.add(word);
            i=j+1+l;
        }
     return res;
    }
}
