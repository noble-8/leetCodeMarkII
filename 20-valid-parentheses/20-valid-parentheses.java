class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                st.push('(');
            if(s.charAt(i)==')'){
                if(!st.isEmpty()&&st.peek().equals('('))
                    st.pop();
                else
                    return false;
            }
            if(s.charAt(i)=='{')
                st.push('{');
            if(s.charAt(i)=='}'){
                if(!st.isEmpty()&&st.peek().equals('{')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            if(s.charAt(i)=='['){
                st.push('[');   
            }
            if(s.charAt(i)==']'){
                if(!st.isEmpty()&&st.peek().equals('[')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        return st.isEmpty();
    }
}