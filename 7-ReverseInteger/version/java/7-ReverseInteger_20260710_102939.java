// Last updated: 10/07/2026, 10:29:39
1class Solution {
2    public int reverse(int x) {
3        int s=0;
4    while(x!=0){
5         if (s > Integer.MAX_VALUE / 10 || s < Integer.MIN_VALUE / 10) {
6                return 0;
7            }
8            int d=x%10;
9            s=s*10+d;
10            x=x/10;
11        }
12        return s;
13    }
14}