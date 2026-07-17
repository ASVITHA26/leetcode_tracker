// Last updated: 17/07/2026, 14:36:44
1class Solution {
2    public int divide(int dividend, int divisor) {
3        int res;
4        if(dividend==-2147483648 && divisor == -1)
5        {
6            return 2147483647;
7        }
8        res=dividend/divisor;
9    return res;
10    }
11}