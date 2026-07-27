// Last updated: 27/07/2026, 16:17:49
1class Solution {
2    public int titleToNumber(String c) {
3        int r=0;
4        for(int i=0;i<c.length();i++){
5            r=r*26+(c.charAt(i)-'A'+1);
6        }
7        return r;
8    }
9}