// Last updated: 27/07/2026, 16:22:51
1class Solution {
2    public String convertToTitle(int s) {
3        StringBuilder t=new StringBuilder();
4        while(s>0){
5            s--;
6            t.append((char)('A'+(s%26)));
7            s/=26;
8        }
9        return t.reverse().toString();
10    }
11}