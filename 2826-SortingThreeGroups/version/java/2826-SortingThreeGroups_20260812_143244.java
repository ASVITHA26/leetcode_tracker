// Last updated: 12/08/2026, 14:32:44
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character>st = new Stack<>();
4        for(char ch : s.toCharArray()){
5            st.push(ch);
6            if(st.size()>=3){
7                if(st.peek()=='c' && st.get(st.size()-2)=='b' && st.get(st.size()-3)=='a'){
8                    st.pop();
9                    st.pop();
10                    st.pop();
11                }
12            }
13        }
14        return st.isEmpty();
15    }
16}