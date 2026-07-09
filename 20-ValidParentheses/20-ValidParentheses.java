// Last updated: 09/07/2026, 18:08:27
class Solution {
    public boolean isValid(String s) {
        int[] ans = new int[s.length()];
        int total =-1;
        for(char c : s.toCharArray()){
            if(c == '('){
                ans[++total] = ')';
            }
            else if(c == '{'){
                ans[++total]= '}';
            }
            else if(c =='['){
                ans[++total] =']';
            }
            else if( total == -1 || ans[total--] != c){
                return false;
            }
        }
        return total == -1;
    }
}