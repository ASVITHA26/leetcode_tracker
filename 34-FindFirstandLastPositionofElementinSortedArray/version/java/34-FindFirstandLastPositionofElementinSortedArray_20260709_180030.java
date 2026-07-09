// Last updated: 09/07/2026, 18:00:30
1class Solution {
2    public boolean isValid(String s) {
3        int[] ans = new int[s.length()];
4        int total =-1;
5        for(char c : s.toCharArray()){
6            if(c == '('){
7                ans[++total] = ')';
8            }
9            else if(c == '{'){
10                ans[++total]= '}';
11            }
12            else if(c =='['){
13                ans[++total] =']';
14            }
15            else if( total == -1 || ans[total--] != c){
16                return false;
17            }
18        }
19        return total == -1;
20    }
21}