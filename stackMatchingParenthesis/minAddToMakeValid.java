class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int ans=0;
        for(char ch:s.toCharArray()){
            if(st.isEmpty())st.push(ch);
            else if(st.peek()=='(' && ch==')')st.pop();
            else if(ch==')')ans++;
            else{
                st.push('(');
            }
        }
        return ans+st.size();
    }
}
