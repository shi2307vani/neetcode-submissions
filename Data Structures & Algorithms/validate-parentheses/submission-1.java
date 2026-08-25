class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        
        for(char breac : s.toCharArray()){
            if(breac=='(' || breac=='{'||breac=='['){
                st.push(breac);
            }
            else{ 
                if (st.isEmpty()) {
                    return false;
                }
                char p = st.pop();
                
                if((p == '(' && breac==')') || (p == '{' && breac=='}') || (p == '[' && breac==']')){
                   continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.size()==0;
        
    }
}
