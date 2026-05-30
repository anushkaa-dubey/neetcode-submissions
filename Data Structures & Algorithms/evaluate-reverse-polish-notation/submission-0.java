class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int a,b=0;
        for(String token:tokens){
          if(token.equals("+")){
            b=st.pop();
            a=st.pop();
            st.push(a+b);
            }
            else if(token.equals("-")){
            b=st.pop();
            a=st.pop();
            st.push(a-b);
            }
            else if(token.equals("*")){
            b=st.pop();
            a=st.pop();
            st.push(b*a);
            }
            else if(token.equals("/")){
            b=st.pop();
            a=st.pop();
            st.push(a/b);
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
